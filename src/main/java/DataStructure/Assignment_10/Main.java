package DataStructure.Assignment_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String inputFilePath = "src/main/java/DataStructure/Assignment_10/Assignment 10 Wikipedia Pages.txt";
        String outputFilePath = "src/main/java/DataStructure/Assignment_10/output.txt";

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                WikiPage wikiPage = new WikiPage(line);
                wikiPage.setId();
                wikiPage.setUrl();
                wikiPage.setTitle();
                wikiPage.setContent();
                wikiPage.setWordList();
//                System.out.println("Words from line: " + wikiPage.getLine());
//                System.out.println("Extracted words: " + wikiPage.getWordList());

                List<String> words = wikiPage.getWordList();
                for (String word : words) {
                    word = word.toLowerCase();
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCount.entrySet());
        // use lambda function
        wordList.sort((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));

        int j = 0;
        for (Map.Entry<String, Integer> entry : wordList) {

            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            j++;

            if (j >= 500) {
                break;
            }
        }
    }
}
