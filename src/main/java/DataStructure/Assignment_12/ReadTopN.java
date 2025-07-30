package DataStructure.Assignment_12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ReadTopN {

    public static void main(String[] args) {
        String inputFilePath = "src/main/java/DataStructure/Assignment_12/numbers.txt";
        int N = 10;
        PriorityQueue<Integer> topN = new PriorityQueue<>(); // a min-heap by default

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath)) ) {

            String line;
            while ((line = reader.readLine()) != null) {

                int number;
                // Parse the line as an integer
                try {
                    number = Integer.parseInt(line.trim());
                } catch (Exception e) {
                    System.err.println("Error parsing line: " + line + " - " + e.getMessage());
                    continue; // Skip this line if parsing fails
                }

                topN.offer(number);
                if (topN.size() > N) {
                    topN.poll();
                }

            }
        } catch (Exception e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        List<Integer> topNList = new ArrayList<>(topN);
        topNList.sort((a,b) -> Integer.compare(b, a));
        for (int i=0; i<topN.size(); i++) {
            System.out.println("Top " + (i+1) + ": " + topNList.get(i) );
        }
    }
}
