package PipedStreams;
//Problem Statement:
//Implement a Java program where one thread writes data into a PipedOutputStream and another thread reads data from a PipedInputStream.

import java.io.*;

public class InterThreadCommunication {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis); // Connect the streams

        Thread writerThread = new Thread(() -> {
            try (PipedOutputStream p = pos) {
                p.write("Hello from writer thread!".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread readerThread = new Thread(() -> {
            try (PipedInputStream p = pis) {
                int data;
                while ((data = p.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();
        readerThread.start();
    }
}
