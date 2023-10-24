package edu.neu.mgen;

import java.util.ArrayList;
import java.util.List;

public class Lab1Part2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ada");
        names.add("Alice");
        names.add("Allan");
        names.add("Amy");
        names.add("Arthur");

        // Create a new ArrayList to store names after switching first and last characters.
        List<String> switchedNames = new ArrayList<>();
        
        // For each name in the original list, switch its first and last characters and add to the switchedNames list.
        for (String name : names) {
            switchedNames.add(switchFirstAndLast(name));
        }

        // Print the original names.
        System.out.println("Names = {" + listToString(names) + "}");
        
        // Print the names after switching first and last characters.
        System.out.println("Names (switched) = {" + listToString(switchedNames) + "}");
    }

    // Method to switch the first and last characters of a given name.
    public static String switchFirstAndLast(String name) {
        
        // Return the name as is if it's null or has a length of 1 or less.
        if (name == null || name.length() <= 1) {
            return name;
        }

        // Extract the last character of the name and convert it to uppercase.
        char firstChar = Character.toUpperCase(name.charAt(name.length() - 1));
        
        // Extract the first character of the name and convert it to lowercase.
        char lastChar = Character.toLowerCase(name.charAt(0));
        
        // Extract the middle part of the name, excluding the first and last characters.
        String middle = name.substring(1, name.length() - 1);

        // Return the switched name.
        return firstChar + middle + lastChar;
    }

    // Method to convert a list of strings to a single comma-separated string.
    public static String listToString(List<String> list) {
        
        // Use StringBuilder for efficient string concatenation.
        StringBuilder sb = new StringBuilder();
        
        // Iterate over each element in the list.
        for (int i = 0; i < list.size(); i++) {
            
            // Append the current list element to the StringBuilder.
            sb.append(list.get(i));
            
            // If the current element is not the last one, append a comma and a space.
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        
        // Convert the StringBuilder content to a String and return it.
        return sb.toString();

    }
    
}
