package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    public static void main(String[] args) {

        String fileName = "src/main/java/IO/output.txt";

        try {
            FileReader myFile = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(myFile);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + fileName);
            System.out.println("Error: " + e);
        }
    }
}
