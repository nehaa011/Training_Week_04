package DataStreams;
// Problem Statement:
//Write a Java program that stores student details (roll number, name, GPA) in a binary file and retrieves it later.

import java.io.*;

public class StoreAndRetrievePrimitiveData {
    public static void main(String[] args) {
        String fileName = "src/DataStreams/student.text";

        // Write data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101); // Roll number
            dos.writeUTF("John Doe"); // Name
            dos.writeDouble(3.8); // GPA
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }

        // Read data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
