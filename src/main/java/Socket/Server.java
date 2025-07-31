package Socket;

import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.random.*;

public class Server {
    public static void main(String[] args) {
        int port = 12345;  // Server port
        Random random = new Random();
        int rndNumber = random.nextInt(1, 10);
        int clientNumber, counter=0;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Listening on port " + port);

            // Wait for client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Input and Output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read message from client
            boolean guessFlag = false;
            while (!guessFlag && counter < 10) {
                String message = input.readLine();
                System.out.println("Received from client: " + message);

                try {
                    clientNumber = Integer.parseInt(message);
                } catch (Exception e) {
                    System.out.println("Error processing message: " + e.getMessage());
                    output.println("Invalid input. Please send a number between 1 and 10.");
                    break; // Skip to the next iteration
                }
                // Send response to client
//                output.println("Server received: " + message);
                if (clientNumber == rndNumber) {
                    output.println("Correct! Congratulations! You guessed the number: " + rndNumber);
                    guessFlag = true;
                } else if (clientNumber < rndNumber) {
                    output.println("Your guess is too low. Try again.");
                } else {
                    output.println("Your guess is too high. Try again.");
                }

                counter++;
            }

            // Close connections
            input.close();
            output.close();
            clientSocket.close();
            System.out.println("Client connection closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}