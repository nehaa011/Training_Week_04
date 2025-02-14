package BufferedReader;
// Problem Statement:
//Write a program that asks the user for their name, age, and favorite programming language, then saves this information into a file.


import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInputFromConsole {
    public static void main(String[] args) {

        String userDataPath = "src/BufferedReader/SourceFile.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(userDataPath);) {

//          Take user's name as input
            System.out.println("Enter your name: ");
            String name = reader.readLine();

//          Take user's age as input
            System.out.println("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

//          Take user's fav Programming language as input
            System.out.println("Enter your favourite programming language: ");
            String favProgLang = reader.readLine();

//            Write the user's data into the file
            writer.write("User name: " + name + " \n");
            writer.write("User age: " + age + " \n");
            writer.write("User favourite programming language: " + favProgLang + " \n");

            System.out.println("Input data saved successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred!" + e.getMessage());
        }
    }
}


