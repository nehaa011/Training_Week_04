package BufferedReader;
//Problem Statement:
//Develop a Java program that efficiently reads a large text file (500MB+) line by line and prints only lines containing the word "error".

import java.io.FileReader;
import java.io.*;

public class ReadLargeFileLineByLine {
    public static void main(String[] args) {
        String fileName = "src/BufferedReader/largeFile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line); // Print lines containing "error"
                }
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
