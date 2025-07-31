package DataStructure.Assignment_13;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static List<TaxiInfo> getTaxiInfoList() {

        String inputFilePath = "src/main/java/DataStructure/Assignment_13/Taxi Data Sorted Small Assignment 13.csv";
        String line;
        List<TaxiInfo> taxiInfoList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            while ((line = reader.readLine()) != null) {
                TaxiInfo taxiInfo = new TaxiInfo(line);
                taxiInfo.setTotalPay();
                taxiInfoList.add(taxiInfo);
            }
        } catch (Exception e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        return taxiInfoList;
    }

    public static void writeToList(List<TaxiInfo> taxiInfoList) {
        String outputFilePath = "src/main/java/DataStructure/Assignment_13/SORTED-FILE-RESULT.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (TaxiInfo taxiInfo : taxiInfoList) {
                writer.write(taxiInfo.getLine());
                writer.newLine();
                writer.flush(); // write to disk immediately
            }
            writer.close();
            System.out.println("Successfully wrote to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        List<TaxiInfo> taxiInfoList = getTaxiInfoList();

        // sort the list in ascending order
        Collections.sort(taxiInfoList);

        writeToList(taxiInfoList);

    }
}
