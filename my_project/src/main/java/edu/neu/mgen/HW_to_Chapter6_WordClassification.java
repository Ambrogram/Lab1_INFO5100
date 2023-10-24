package edu.neu.mgen;

// Import the Scanner class for reading user input.
import java.util.Scanner;

// Define the WordClassification class.
public class HW_to_Chapter6_WordClassification {
    
    // Main method that serves as the entry point for the program.
    public static void main(String[] args) {
        
        // Create a new Scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word.
        System.out.print("Enter any word: ");
        
        // Record the current time (in milliseconds) to measure the user's reaction time.
        long startTime = System.currentTimeMillis();

        // Read the user's input until they press Enter.
        String word = scanner.nextLine();

        // Record the current time (in milliseconds) after the user has input the word.
        long endTime = System.currentTimeMillis();
        
        // Calculate the elapsed time (in seconds) the user took to input the word.
        long elapsedSeconds = (endTime - startTime) / 1000;

        // Check if the user did not enter any word.
        if (word.isEmpty()) {
            System.out.println("You did not enter any word");
            scanner.close(); // Close the scanner to release resources.
            return;          // Exit the method since no word was provided.
        }

        // Variable to store the classification of the word based on its length.
        String classification = "";
        
        // Get the length of the word.
        int length = word.length();

        // Classify the word as "short" if its length is 5 or less.
        if (length <= 5) {
            classification = "short";
        } 
        // Classify the word as "medium" if its length is between 6 and 10.
        else if (length <= 10) {
            classification = "medium";
        } 
        // Classify the word as "long" if its length is greater than 10.
        else {
            classification = "long";
        }

        // Print the entered word.
        System.out.println("Your word is " + word);
        
        // Print the classification of the word based on its length.
        System.out.println("It is a " + classification + " word");
        
        // Print the length of the word.
        System.out.println("The length of the word is " + length);
        
        // Print the reaction time of the user in seconds.
        System.out.println("Your reaction time is " + elapsedSeconds + " seconds");
        
        // Close the scanner to release resources.
        scanner.close(); 
    }
}

