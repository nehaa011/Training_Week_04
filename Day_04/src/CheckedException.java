//Problem Statement:
//Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.

import java.io.*;

    public class CheckedException{
        public static void main(String[] args) {
            // Try to read the file "data.txt"
            try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }
    }
