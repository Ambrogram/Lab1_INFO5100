package edu.neu.mgen;

public class HW7_MatrixMultification {
    // Main method to execute the program
    public static void main(String[] args) {
        // Initialize matrix A
        int[][] A = {{2, 3, 4}, {3, 4, 5}};
        // Initialize matrix B
        int[][] B = {{1, 2}, {3, 4}, {5, 6}};

        // Check if the matrices can be multiplied (number of columns in A should be equal to number of rows in B)
        if (A[0].length == B.length) {
            // If they can be multiplied, calculate the product of A and B
            int[][] product = multiplyMatrices(A, B);

            // Print the result
            System.out.println("Product of matrices A and B:");
            // Call the method to print the matrix
            printMatrix(product);
        } else {
            // If they cannot be multiplied, print an error message
            System.out.println("Matrices cannot be multiplied");
        }
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        // Get the number of rows in A
        int rowsA = A.length;
        // Get the number of columns in A
        int colsA = A[0].length;
        // Get the number of columns in B
        int colsB = B[0].length;

        // Initialize the product matrix with the appropriate dimensions
        int[][] product = new int[rowsA][colsB];

        // Loop through each row of A
        for (int i = 0; i < rowsA; i++) {
            // Loop through each column of B
            for (int j = 0; j < colsB; j++) {
                // Initialize the sum for this cell to 0
                product[i][j] = 0;
                // Loop through each element for the dot product
                for (int k = 0; k < colsA; k++) {
                    // Multiply corresponding elements and add to the current sum
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        // Return the resulting product matrix
        return product;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        // Start printing the matrix, beginning with an opening square bracket to denote the start of the 2D array
        System.out.println("[");
    
        // Iterate through each row of the matrix
        for (int[] row : matrix) {
            // For each row, print an opening square bracket to denote the start of this row array
            System.out.print(" [");
            
            // Iterate through each value in the current row
            for (int val : row) {
                // Print the current value followed by a space
                System.out.print(val + " ");
            }
            
            // After printing all values in the current row, print a closing bracket for this row
            System.out.println("]");
        }
        
        // After printing all rows of the matrix, print a closing square bracket to denote the end of the 2D array
        System.out.println("]");
    }
    
    
    
}

