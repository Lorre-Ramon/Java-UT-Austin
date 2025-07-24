package IO.Assignment_8;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String inputFilePath = "src/main/java/IO/Assignment_8/part.tbl.txt";
        String outputFilePath = "src/main/java/IO/Assignment_8/output.csv";
        String header = "";
        List<Product> myProducts = new ArrayList<Product>();

// Phase #1: Read in the file
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (i > 0) {
                    myProducts.add(new Product(line));
                } else {
                    header = line;
                }
                i++;
            }

        } catch (IOException e) {
            System.err.println("Error reading the file:" + e.getMessage());
            e.printStackTrace();
        }

// Phase #2: Sort the file
        Collections.sort(myProducts, Collections.reverseOrder());
        myProducts.sort(Product.bySize);
//      TEST: only for testing
//        for (int j=0; j<10; j++) {
//            System.out.println(myProducts.get(j));
//        }

// Phase #3: Write to a file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            // Write the header
            writer.write(String.join(",", header.split("\\|")));
            writer.newLine();

            for (Product product : myProducts) {
                writer.write(product.toCSVFile());
                writer.newLine();
            }
            System.out.println("Successfully wrote to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            e.printStackTrace();
        }


    }
}
