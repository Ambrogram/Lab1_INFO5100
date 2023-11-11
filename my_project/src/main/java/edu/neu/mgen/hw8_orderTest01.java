package edu.neu.mgen;

public class hw8_orderTest01 {
    public static void main(String[] args) {
        // First array
        String[] array1 = {"Anne", "John", "Alex", "Jessica"};
        printArray("Original array", array1);
        printArray("Resultant array", reverseAndFormatArray(array1));

        // Second array
        String[] array2 = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        printArray("Original array", array2);
        printArray("Resultant array", reverseAndFormatArray(array2));
    }

    // Method to reverse and format the strings in the array
    public static String[] reverseAndFormatArray(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = new StringBuilder(array[array.length - 1 - i]) // Reverse the string
                            .reverse()
                            .toString()
                            .toLowerCase();
            result[i] = Character.toUpperCase(result[i].charAt(0)) + result[i].substring(1); // Capitalize first letter
        }
        return result;
    }

    // Method to print arrays
    public static void printArray(String title, String[] array) {
        System.out.println(title + ":");
        for (String element : array) {
            System.out.println(" \"" + element + "\",");
        }
        System.out.println(" End of the array\n");
    }
}

