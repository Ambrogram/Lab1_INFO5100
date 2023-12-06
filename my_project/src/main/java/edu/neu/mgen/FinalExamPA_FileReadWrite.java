package edu.neu.mgen;

import java.io.*;

public class FinalExamPA_FileReadWrite {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "C:\\Users\\33506\\Desktop\\myFile.txt"; 

        // Try to open and read the file
        try {
            // Creating a File object for the file
            File file = new File(filePath);

            // Creating a BufferedReader to read the file
            BufferedReader br = new BufferedReader(new FileReader(file));

            // Reading and printing the file content
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }

            // Close the BufferedReader
            br.close();

            // Creating a FileWriter in append mode
            FileWriter fw = new FileWriter(file, true);

            // Writing a new line to the file
            fw.write("\nA new string");

            // Close the FileWriter
            fw.close();
        }
        // Catch block to handle exceptions
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
