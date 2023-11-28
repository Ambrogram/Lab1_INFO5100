package edu.neu.mgen;

// public class hw8_orderTest03 {
//     public static void main(String[] args) {
//         String[] stringArray = {"Hello", "World", "Java", "Programming", "Example"};

//         // Reversing each string in the array
//         for (int i = 0; i < stringArray.length; i++) {
//             stringArray[i] = reverseString(stringArray[i]);
//         }

//         // Printing the reversed strings
//         System.out.println("Reversed Strings:");
//         for (String str : stringArray) {
//             System.out.println(str);
//         }
//     }

//     public static String reverseString(String str) {
//         char[] charArray = str.toCharArray(); // Convert the String to a char array

//         int start = 0; // Start index
//         int end = charArray.length - 1; // End index

//         while (start < end) {
//             // Swap the characters
//             char temp = charArray[start];
//             charArray[start] = charArray[end];
//             charArray[end] = temp;

//             // Move the start and end indices
//             start++;
//             end--;
//         }

//         return new String(charArray); // Convert the char array back to a String
//     }
// }



public class hw8_orderTest03{

    public static void main(String[] args) {
        String[] namearray = {"Anne", "John", "Alex", "Jessica"};

        // Reversing each string in the array and formatting
        for (int i = 0; i < namearray.length; i++) {
            namearray[i] = reverseString(namearray[i]);
        }

        System.out.println("Reversed Namestring:");
        for (String str : namearray) {
            System.out.println(str);
        }
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        String reversed = new String(charArray); // Convert the char array back to a String
        reversed = reversed.toLowerCase(); // Convert the whole string to lower case
        if (reversed.length() > 0) {
            reversed = Character.toUpperCase(reversed.charAt(0)) + reversed.substring(1); // Capitalize the first letter
        }

        return reversed;
    }
}
