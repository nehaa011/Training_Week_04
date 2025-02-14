package ByteArrayStream;
//Problem Statement:
//Write a Java program that converts an image file into a byte array and then writes it back to another image file.

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        String imagePath = "src/ByteArrayStream/input.png";
        String outputPath = "src/ByteArrayStream/output.jpg";

        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead); // Write to ByteArrayOutputStream
            }

            byte[] imageBytes = baos.toByteArray(); // Convert to byte array
            fos.write(imageBytes); // Write to output file

            System.out.println("Image converted and saved successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
