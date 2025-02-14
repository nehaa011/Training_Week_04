package File_Handling;
//Problem Statement:
//Write a Java program that reads the contents of a text file and writes it into a new file.
//If the source file does not exist, display an appropriate message.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteTextFile {
    public static void main(String[] args){
        String sourceFile= "src/File_Handling/SourceFile.txt";
        String destinationFile= "src/File_Handling/DestinationFile.txt";

        try(FileInputStream fileInput = new FileInputStream(sourceFile);
            FileOutputStream fileOutput= new FileOutputStream(destinationFile)){

            int byteData;

            while((byteData= fileInput.read()) != -1){
                fileOutput.write(byteData);
            }
            System.out.println("File copied successfully.");
        }
        catch(FileNotFoundException e){
            System.out.println("Source.txt file not found: " + sourceFile);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
