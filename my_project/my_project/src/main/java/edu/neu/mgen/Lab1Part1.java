package edu.neu.mgen;

public class Lab1Part1 {
    public static void main(String[] args) {
        int [] x = {8, 7, 6, 5, 4};
        int [] y = {5, 4, 3, 2, 1};
        int [] z = new int[5];

        
        // This loop iterates over the 'x' array, and for each index 'i', it assigns 
        // the larger value between 'x[i]' and 'y[i]' to 'z[i]'.
        for (int i = 0; i < x.length; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("Array x = {" + arrayToString(x) + "}");
        System.out.println("Array y = {" + arrayToString(y) + "}");
        System.out.println("Array z = x + y = {" + arrayToString(z) + "}");
    }
    // Method to convert an integer array to its string representation.
    public static String arrayToString(int[] arr) {
        // Initialize a StringBuilder to efficiently concatenate strings.
        StringBuilder sb = new StringBuilder();

        // Iterate over each element in the provided array.
        for (int i = 0; i < arr.length; i++) {
            // Append the current array element to the StringBuilder.
            sb.append(arr[i]);
            // If the current element is not the last element in the array,
            // append a comma and a space to separate values.
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        // Convert the StringBuilder content to a String and return it.
        return sb.toString();
    }
    
}
