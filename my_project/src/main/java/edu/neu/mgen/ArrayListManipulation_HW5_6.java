package edu.neu.mgen;

import java.util.ArrayList;

public class ArrayListManipulation_HW5_6 {
    public static void main(String[] args) {
        // Create an ArrayList with specified strings
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + cities);

        // Remove "Paris" from the ArrayList
        cities.remove("Paris");

        // Print the ArrayList after removal
        System.out.println("ArrayList after removing 'Paris': " + cities);
    }
}

