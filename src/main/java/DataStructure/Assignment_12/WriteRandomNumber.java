package DataStructure.Assignment_12;

import java.util.Random;
import java.io.*;

public class WriteRandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        String outputFilePath = "src/main/java/DataStructure/Assignment_12/numbers.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            int i = 0;
            while (i<100) {
                int randomNumberInt = random.nextInt();
                writer.write(String.valueOf(randomNumberInt));
                writer.newLine();
                i++;
            }

        } catch (Exception e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            e.printStackTrace();
        }


//        try (BufferedReader reader = new BufferedReader(new FileReader(outputFilePath))) {
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//
//            }
//
//        } catch (IOException e) {
//            System.err.println("Error reading the file:" + e.getMessage());
//            e.printStackTrace();
//        }


//        // Generate a random integer
//        int randomNumberInt = random.nextInt(); // Generates a random int across the full range
//        System.out.println("Random integer: " + randomNumberInt);
//
//        // Generate a random integer within a specific bound (0 to bound-1)
//        int randomNumberBounded = random.nextInt(100); // Generates a random int between 0 and 99
//        System.out.println("Random integer (0-99): " + randomNumberBounded);
//
//        // Generate a random double
//        double randomNumberDouble = random.nextDouble(); // Generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
//        System.out.println("Random double: " + randomNumberDouble);


    }

}
