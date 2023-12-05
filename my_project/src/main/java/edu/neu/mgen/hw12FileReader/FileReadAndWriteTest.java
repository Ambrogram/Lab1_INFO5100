package edu.neu.mgen.hw12FileReader;

// Importing required classes from java.nio.file package for file operations.
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Importing the Scanner class for reading input from the user.
import java.util.Scanner;

// Declaring a public class named FileReadAndWriteTest.
public class FileReadAndWriteTest {
    // The main method - serves as the entry point for the program.
    public static void main(String[] args) {
        try {
            // Reading from a file:
            // Define the file path as a string.
            String filePath = "D:\\YZW_SDE\\JAVA_HOME\\java_project\\my_project\\my_project\\src\\main\\java\\edu\\n" + //
                    "eu\\mgen\\hw12FileReader\\my_test_file.txt";
            // Read all bytes from the file into a byte array and create a string.
            // Paths.get(filePath) converts the string path to a Path object.
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            // Output the content of the file to the console.
            System.out.println("Content read from file: " + content);

            // Getting input from the user:
            // Create a new Scanner object to read input from the standard input stream.
            Scanner scanner = new Scanner(System.in);
            // Prompt the user to enter a phrase.
            System.out.print("Enter your phrase: ");
            // Read the entire line of input from the user.
            String userInput = scanner.nextLine();
            // Close the scanner to prevent resource leaks.
            scanner.close();

            // Writing to a file:
            // Write the user's input to the file.
            // Converts the string to a byte array and writes it to the file at the given path.
            // StandardOpenOption.WRITE specifies that the file is opened for writing.
            //Files.write(Paths.get(filePath), userInput.getBytes(), StandardOpenOption.WRITE);
            //  the code above is overwriting it,not appending a new line below it 
            Files.write(Paths.get(filePath), (userInput + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

            // Confirmation message after writing to the file.
            System.out.println("Phrase written to file.");

        } catch (Exception e) { // Catching any exceptions that occur during file operations.
            e.printStackTrace(); // Printing the stack trace for the exception.
        }
    }
}
