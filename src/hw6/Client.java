package hw6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static Socket socket;
    static final int PORT = 8189;

    public static void main(String[] args) {
        try {
            socket = new Socket("localhost", PORT);
            System.out.println("Connected to server");

            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner scKeyboard = new Scanner(System.in);

            new Thread(() -> {
                while (true) {
                    String serverMsg = scKeyboard.nextLine();
                    out.println(serverMsg);
                }

            }).start();

            while (true) {
                String str = in.nextLine();

                System.out.println("Sever: " + str);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
