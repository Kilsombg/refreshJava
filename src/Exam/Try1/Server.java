package Exam.Try1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static ServerSocket server;
    private static int port = 1234;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        server = new ServerSocket(port);

        while(true) {
            System.out.println("Waiting for the client request");
            Socket socket = server.accept();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message received " + message);

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject("Hi client " + message);

            ois.close();
            oos.close();
            socket.close();

            if(message.equalsIgnoreCase("exit")) break;
        }

        System.out.println("Shutting down server.");
        server.close();
    }
}
