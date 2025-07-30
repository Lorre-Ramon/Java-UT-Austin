package DataStructure.Assignment_9;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String inputFilePath = "src/main/java/IO/Assignment_8/part.tbl.txt";
        String outputFilePath = "src/main/java/IO/Assignment_8/output.csv";
        String header = "";
        List<Product> myProducts = new ArrayList<Product>();

        Map<Integer, Product> idIndex = new HashMap<Integer, Product>();
        Map<String, Product> nameIndex = new HashMap<String, Product>();
        int userSearchType = 0;
        int userSearchId = -1;
        String userSearchName = "";

// Phase #1: Read in the file
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (i > 0) {
                    myProducts.add(new Product(line));

                    idIndex.put(myProducts.get(myProducts.size() - 1).partkey, myProducts.get(myProducts.size()-1));
                    nameIndex.put(myProducts.get(myProducts.size()-1).name, myProducts.get(myProducts.size()-1));

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
        System.out.printf("Search by: %n1. id, 2. name%n");
        System.out.println("Prompt in: (1/2)");

        userSearchType = scnr.nextInt();
        scnr.nextLine();

        if (userSearchType == 1) {
            System.out.println("Prompt the id:");
            userSearchId = scnr.nextInt();
            scnr.nextLine();

            System.out.println(idIndex.get(userSearchId));

        } else if (userSearchType == 2) {
            System.out.println("Prompt the name:");
            userSearchName = scnr.nextLine();

            System.out.println(nameIndex.get(userSearchName));
        } else {
            System.out.println("Wrong prompt. Goodbye.");
        }

// Phase #4: Write to a file

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
