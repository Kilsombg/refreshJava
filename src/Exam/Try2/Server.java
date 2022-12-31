package Exam.Try2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        int port = 1234;
        ServerSocket serverSocket = null;
        Socket connection = null;
        Scanner socketIn = null;
        PrintWriter socketOut = null;

        try {
            serverSocket = new ServerSocket(port);

            while(true) {
                System.out.println("Waiting for client...");
                connection = serverSocket.accept();
                System.out.println("Connected " + connection.getInetAddress().getHostName());

                socketOut = new PrintWriter(connection.getOutputStream(),true);
                System.out.println("Waiting for command...");
                socketOut.println("Available commands: \"hi\" and \"exit\"");

                socketIn = new Scanner(new BufferedReader(new InputStreamReader(connection.getInputStream())));

                String command = null;
                do {
                    socketOut.flush();
                    command = socketIn.nextLine();
                    switch (command) {
                        case "hi":
                            System.out.println("Client submitted \"hi\" command.");
                            socketOut.println("OK");
                            break;
                        case "exit":
                            System.out.println("Client submitted \"exit\" command.");
                            socketOut.println("OK");
                            break;
                        default:
                            System.out.println("Unknown command");
                            socketOut.println("Unknown command");
                            break;
                    }
                } while(!command.equalsIgnoreCase("exit"));
                System.out.println("Close connection with " + connection.getInetAddress().getHostName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socketIn != null)
                    socketIn.close();
                if (socketOut != null)
                    socketOut.close();
                if (connection != null)
                    connection.close();
            } catch (IOException e) {
                System.out.println("Can't close the socket");
            }
        }
    }
}