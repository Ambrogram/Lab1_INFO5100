package my_project.src.main.java.edu.neu.mgen;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");//The tradition of using "Hello, World!" as a test message started with the C programming language in the 1970s. 
        /*The first instance is attributed to Brian Kernighan,an author of the C programming language. 
        In 1978, he and Dennis Ritchie published "The C Programming Language",
        where they used "Hello, World!" as the first example.
        */

        // Declare and initialize variables
        int intVar1 = 10, intVar2 = 20;
        long longVar1 = 300L, longVar2 = 400L;
        double doubleVar1 = 10.5, doubleVar2 = 20.5;
        boolean booleanVar1 = true, booleanVar2 = false;
        char charVar1 = 'A', charVar2 = 'B';

        // Convert int to long
        long convertedLong1 = intVar1;
        long convertedLong2 = intVar2;

        // Convert long to int
        int convertedInt1 = (int) longVar1;
        int convertedInt2 = (int) longVar2;

        // Input values from terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer value for intVar1: ");
        intVar1 = scanner.nextInt();
        System.out.println("Enter a long value for longVar1: ");
        longVar1 = scanner.nextLong();
        System.out.println("Enter a double value for doubleVar1: ");
        doubleVar1 = scanner.nextDouble();
        System.out.println("Enter a boolean value for booleanVar1: ");
        booleanVar1 = scanner.nextBoolean();
        System.out.println("Enter a character for charVar1: ");
        charVar1 = scanner.next().charAt(0);

        // Perform various arithmetic and logical operations
        int intSum = intVar1 + convertedInt1;
        long longSum = longVar1 + convertedLong1;
        double doubleSum = doubleVar1 + doubleVar2;
        boolean booleanResult = booleanVar1 && booleanVar2;
        int charSum = charVar1 + charVar2;

        // Print the results
        System.out.println("Sum of intVar1 and convertedInt1: " + intSum);
        System.out.println("Sum of longVar1 and convertedLong1: " + longSum);
        System.out.println("Sum of doubleVar1 and doubleVar2: " + doubleSum);
        System.out.println("Logical AND of booleanVar1 and booleanVar2: " + booleanResult);
        System.out.println("Sum of ASCII values of charVar1 and charVar2: " + charSum);

    }
    

    
}



