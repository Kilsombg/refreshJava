package Exam.TryExample;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.stream.Collectors;

public class Server {
    private static final String USERS_FILENAME = "users.bin";
    private final Object usersLock;
    private ServerSocket server;


    public Server() {
        initAdmins();
        usersLock = new Object();
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
        try {
            System.out.println("Server listening.");
            server = new ServerSocket(8080);

            while (true) {
                Socket client = server.accept();

                Thread clientThread = new Thread(() ->
                {
                    System.out.println("Accepted client.");
                    Scanner sc = null;
                    PrintStream out = null;

                    try {
                        sc = new Scanner(client.getInputStream());
                        out = new PrintStream(client.getOutputStream());
                        userMenu(sc, out);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (sc != null)
                            sc.close();
                        if (out != null)
                            out.close();
                    }
                });

                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void userMenu(Scanner sc, PrintStream out) {
        while (true) {
            out.println("Login? Y/N");
            String login = sc.nextLine();

            if (!login.equalsIgnoreCase("Y")) {
                out.println("Goodbye.");
                return;
            }

            out.println("Enter username:");
            String username = sc.nextLine();

            out.println("Enter password");
            String password = sc.nextLine();

            User user = login(username, password);

            if (user == null) {
                out.println("Error: Invalid login.");
                continue;
            }

            switch (user.getUserType()) {
                case ADMIN: {
                    adminMenu(sc, out, (Admin) user);
                    break;
                }
                case STUDENT: {
                    studentMenu(sc, out, (Student) user);
                    break;
                }
                case TEACHER: {
                    teacherMenu(sc, out, (Teacher) user);
                    break;
                }
            }
        }
    }


    private void registerUser(String username, String password, UserType userType) throws CredentialException {
        User user = UserFactory.createUser(username, password, userType);

        synchronized (usersLock) {
            List<User> users = loadUsers();
            users.add(user);
            saveUsers(users);
        }
    }

    private void adminMenu(Scanner sc, PrintStream out, Admin admin) {
        out.println("Logged in as admin.");

        out.println("Enter user type to create: ADMIN | STUDENT | TEACHER");
        try {
            UserType userType = UserType.valueOf(sc.nextLine().toUpperCase());

            out.println("Enter username:");
            String username = sc.nextLine();

            out.println("Enter password:");
            String password = sc.nextLine();

            registerUser(username, password, userType);

            out.println("Success.");
        } catch (IllegalArgumentException e) {
            out.println("Error: Invalid user type.");
        } catch (CredentialException e) {
            out.println(e.getMessage());
        }
    }


    private void studentMenu(Scanner sc, PrintStream out, Student student) {
        out.println("Logged in as student.");
        List<Grade> sortedGrades = student.getGrades()
                .stream()
                .sorted(Comparator.comparingInt(Grade::getSemester).thenComparing(Grade::getSubject))
                .collect(Collectors.toList());
        out.println(sortedGrades);
    }

    private void teacherMenu(Scanner sc, PrintStream out, Teacher teacher) {
        out.println("Logged in as teacher.");

        out.println("Enter student faculty number:");
        String facultyNumber = sc.nextLine();

        out.println("Enter subject:");
        String subject = sc.nextLine();

        out.println("Enter semester:");
        int semester = Integer.parseInt(sc.nextLine());

        out.println("Enter grade:");
        int gradeValue = Integer.parseInt(sc.nextLine());

        Grade grade = new Grade(subject,semester,gradeValue);

        synchronized (usersLock) {
            List<User> users = loadUsers();
            for(User user: users) {
                if(user.getUsername().equals(facultyNumber) && user instanceof Student){
                    Student student = (Student) user;
                    student.getGrades().add(grade);
                    saveUsers(users);

                    out.println("Success");
                    return;
                }
            }
            out.println("No such student.");
        }
    }

    private User login(String username, String password) {
        synchronized (usersLock) {
            for (User user : loadUsers()) {
                if (Objects.equals(user.getUsername(), username) && Objects.equals(user.getPassword(), password))
                    return user;
            }
        }
        return null;
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
