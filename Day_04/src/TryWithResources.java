//Problem Statement:
//Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
    import java.io.*;

    public class TryWithResources {
        public static void main(String[] args) {
            // Using try-with-resources to read file
            try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
                System.out.println("First line: " + br.readLine());
            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        }
    }

