package FilterStreams;
// Problem Statement:
//Create a program that reads a text file and writes its contents into another file, converting all uppercase letters to lowercase.

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.*;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        String inputFile = "src/FilterStreams/input.txt";
        String outputFile = "src/FilterStreams/output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase() + "\n"); // Convert to lowercase
            }
            System.out.println("File converted and saved.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
