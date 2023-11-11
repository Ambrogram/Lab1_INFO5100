// Define a class named Midterm7_MatrixSum in the package edu.neu.mgen
package edu.neu.mgen;

public class Midterm7_MatrixSum {

    // The main method - the entry point of the Java program
    public static void main(String[] args) {
        
        // Initializing a 2D array (matrix) named matrix1 with 4 rows and 3 columns
        int[][] matrix1 = {
            {9, 8, 7}, 
            {7, 7, 8}, 
            {9, 6, 4}, 
            {3, 4, 2}  
        };
        
        // Initializing another 2D array (matrix) named matrix2 with 2 rows and 4 columns
        int[][] matrix2 = {
            {2, 3, 4, 5}, 
            {8, 6, 5, 4}  
        };

        // Calling the sumMatrix method with matrix1 as an argument,
        // and printing the result.
        System.out.println("The sum of all elements in the first matrix is: " + sumMatrix(matrix1));

        // Calling the sumMatrix method with matrix2 as an argument,
        // and printing the result.
        System.out.println("The sum of all elements in the second matrix is: " + sumMatrix(matrix2));
    }

    // Define a method named sumMatrix that takes a 2D array (matrix) as a parameter
    // and returns the sum of all its elements
    public static int sumMatrix(int[][] matrix) {
        int sum = 0; // Initialize a variable to store the sum
        
        // Loop through each row of the matrix
        for (int[] row : matrix) {
            // Loop through each element in the current row
            for (int element : row) {
                sum += element; // Add the element to the sum
            }
        }
        
        // Return the calculated sum
        return sum;
    }
}
