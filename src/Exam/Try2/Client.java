package Exam.Try2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket connection = null;
        Scanner socketIn = null;
        PrintWriter socketOut = null;
        Scanner keyboardIn = new Scanner(System.in);
        int port = 1234;
        String host = "localhost";

        try {
            System.out.println("Connecting to server...");
            try {
                connection = new Socket(host,port);
            } catch (UnknownHostException e) {
                System.out.println("Can't connect ot server.");
                return;
            }
            System.out.println("Connected successfully to the server.");

            socketIn = new Scanner(new BufferedReader(new InputStreamReader(connection.getInputStream())));
            System.out.println("Message is: " + socketIn.nextLine());

            String command = null;
            socketOut = new PrintWriter(connection.getOutputStream(),true);
            do {
                socketOut.flush();
                System.out.println("Write command: ");
                command = keyboardIn.nextLine();
                socketOut.println(command.toLowerCase());

                System.out.println("Waiting for answer from the server...");
                String answer = socketIn.nextLine();
                System.out.println("Answer is: " + answer);
            } while(!command.equalsIgnoreCase("exit"));
            System.out.println("Close the connection.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(socketIn != null)
                    socketIn.close();
                if(socketOut != null)
                    socketOut.close();
                if(connection != null)
                    connection.close();
                keyboardIn.close();
            } catch (IOException e) {
                System.out.println("Can't close the socket.");
            }
        }
    }
}
