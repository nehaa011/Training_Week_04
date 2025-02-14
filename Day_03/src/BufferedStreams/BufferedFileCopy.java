package BufferedStreams;
//Problem Statement:
//Create a Java program that copies a large file (e.g., 100MB) from one location to another using Buffered Streams (BufferedInputStream and BufferedOutputStream). Compare the performance with normal file streams.

import java.io.*;

public class BufferedFileCopy {
    private static void copyFileUsingBufferedStream(String sourceFile, String destinationFile, int bufferSize) {

        sourceFile = "src/BufferedStreams/SourceFile.txt";
        destinationFile = "src/BufferedStreams/DestinationFile.txt";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead); // Write in chunks
            }
            System.out.println("File copied using buffered streams.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void copyFileUsingFileStream(String sourceFile, String destFile, int bufferSize) {

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead); // Write in chunks
            }
            System.out.println("File copied using File streams.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String sourceFile = "Day_3/src/main/resources/BufferedFileCopy/largeFile.txt";
        String destFile = "Day_3/src/main/resources/BufferedFileCopy/copyLargeFile.txt";

        int bufferSize = 4096; // 4 KB buffer

//        Copy file using Buffered Streams
        long startTimeBuffered = System.nanoTime();
        copyFileUsingBufferedStream(sourceFile, destFile, bufferSize);
        long endTimeBuffered = System.nanoTime();
        long timeTakenByBufferedStream = (endTimeBuffered - startTimeBuffered);
        System.out.println("Time taken to copy files using Buffered Streams: " + timeTakenByBufferedStream + " ns\n");

//        Copy file using normal File Streams
        long startTimeFile = System.nanoTime();
        copyFileUsingFileStream(sourceFile, destFile, bufferSize);
        long endTimeFile = System.nanoTime();
        long timeTakenByFileStream = (endTimeFile - startTimeFile);
        System.out.println("Time taken to copy files using File Streams: " + timeTakenByFileStream + " ns");

        if (timeTakenByBufferedStream < timeTakenByFileStream) {
            System.out.println("\nBufferedStream is faster than FileStream!");
        }
    }

}
