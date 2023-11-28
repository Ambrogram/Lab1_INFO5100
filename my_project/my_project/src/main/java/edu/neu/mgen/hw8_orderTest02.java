package edu.neu.mgen;

public class hw8_orderTest02{
    public static void main(String[] args) {
        String originalString = "Hello World";
        String reversedString = reverseString(originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray(); // Convert the String to a char array

        int start = 0; // Start index
        int end = charArray.length - 1; // End index

        while (start < end) {
            // Swap the characters
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the start and end indices
            start++;
            end--;
        }

        return new String(charArray); // Convert the char array back to a String
    }
}

