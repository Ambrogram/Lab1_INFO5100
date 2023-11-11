package edu.neu.mgen;

public class hw8_orderTest {
    public static void main(String[] args) {
        String[] stringArray = {"Hello World", "Java Programming", "Reverse this sentence"};

        // Reversing word order for each string in the array
        reverseWordOrderInArray(stringArray);

        // Printing the modified array
        for (String str : stringArray) {
            System.out.println(str);
        }
    }

    public static void reverseWordOrderInArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = reverseWords(array[i]);
        }
    }

    private static String reverseWords(String str) {
        String[] words = str.split(" "); // Splitting the string into words
        StringBuilder reversedString = new StringBuilder();

        // Reversing the order of words
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        return reversedString.toString().trim(); // Convert StringBuilder to String and remove trailing space
    }
}
