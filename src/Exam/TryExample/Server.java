package Exam.TryExample;

import java.io.*;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final String USERS_FILENAME = "users.bin";
    private ServerSocket server;


    public Server() {
        initAdmins();
    }

    private void initAdmins() {
        if (new File(USERS_FILENAME).exists()) return;
        List<User> users = new ArrayList<>();
        users.add(new Admin("admin", "12345"));
        saveUsers(users);
    }

    private void saveUsers(List<User> users) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(USERS_FILENAME))) {
            out.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        List<User> list = loadUsers();
        System.out.println(list);
    }

    public List<User> loadUsers() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(USERS_FILENAME))) {
            return (List<User>) in.readObject();
        } catch (IOException e) {
            if (e instanceof InvalidClassException)
                throw new RuntimeException("Serializable versions are not supported. Try to recreate users file.", e);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
