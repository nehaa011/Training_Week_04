package BufferedReader;
//Problem Statement:
//Write a Java program that counts the number of words in a given text file and displays the top 5 most frequently occurring words.

import java.io.*;
import java.util.*;


public class CountWordsInFile {
    public static void main(String[] args) {
        String fileName = "src/BufferedReader/textFile.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Sort by frequency and display top 5
        wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
