package edu.neu.mgen;

public class StringManipulation_HW5_4 {
    public static void main(String[] args) {
        String str = "Oakland";

        // 1. Find the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. Find a character with index 2 in the string
        char charAtIndex2 = str.charAt(2);
        System.out.println("Character at index 2: " + charAtIndex2);

        // 3. Extract a substring "land" from str
        String substring = str.substring(3); // Adjusted to get "land"
        System.out.println("Extracted substring: " + substring);

        // 4. Convert all letters in str to capital letters "OAKLAND"
        String uppercaseStr = str.toUpperCase();
        System.out.println("String in uppercase: " + uppercaseStr);
    }
}

