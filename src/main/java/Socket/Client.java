package Socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

//        String host = "localhost";
        String host = "35.226.145.32";
        int port = 12345;
        Scanner scnr = new Scanner(System.in);

        try (Socket socket = new Socket(host, port)) {
            System.out.println("Connected to server.");

            // Input and Output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            boolean guessFlag = false;
            while (!guessFlag) {
                System.out.println("Make your guess (1-10): ");

                // Read user input
                String message = scnr.nextLine();
                output.println(message);
                System.out.println("Sent to server: " + message);

                // Read response
                String response = input.readLine();
                System.out.println("Received from server: " + response);

                // Check if the game is over
                if (response.contains("Correct!") ) {
                    System.out.println("Game over. Exiting.");
                    guessFlag = true;
                    input.close();
                    output.close();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
