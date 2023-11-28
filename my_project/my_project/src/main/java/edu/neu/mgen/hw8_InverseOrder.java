package edu.neu.mgen;



public class hw8_InverseOrder {

    // Main method - entry point of the Java application
    public static void main(String[] args) {
        // Initializing an array of names
        String[] namearray = {"Anne", "John", "Alex", "Jessica"};
        // Initializing an array of planet names
        String[] planetarray = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter"};

        // Printing a header for the reversed name strings
        System.out.println("Reversed Namestring:");
        // Calling the method to reverse and print each string in the name array
        processAndPrintArray(namearray);

        // Printing a header for the reversed planet strings
        System.out.println("Reversed Planetstring:");
        // Calling the method to reverse and print each string in the planet array
        processAndPrintArray(planetarray);
    }

    // Method to reverse a single string and format it
    public static String reverseString(String str) {
        // Converting the input string to an array of characters
        char[] chars = str.toCharArray();

        // Using a for loop to reverse the array in place
        // 'start' begins from the start of the array, 'end' from the end
        // The loop runs until 'start' is less than 'end'
        for (int start = 0, end = chars.length - 1; start < end; start++, end--) {
            // Storing the character at the 'start' index in a temporary variable
            char temp = chars[start];
            // Swapping characters at 'start' and 'end'
            chars[start] = chars[end];
            chars[end] = temp;
        }
        // Creating a new String from the reversed character array
        String reversed = new String(chars);

        // Returning the reversed string with the first character capitalized
        // and the rest in lower case
        // Checking if the string is not empty to avoid StringIndexOutOfBoundsException
        return reversed.length() > 0 ? 
               Character.toUpperCase(reversed.charAt(0)) + reversed.substring(1).toLowerCase() 
               : reversed;
    }

    // Method to process (reverse and format) and print each string in an array
    public static void processAndPrintArray(String[] array) {
        // Iterating over the array with two pointers: 'start' and 'end'
        // 'start' begins from the start of the array, 'end' from the end
        // The loop runs until 'start' is less than or equal to 'end'
        for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
            // Reversing and formatting the string at the 'start' index
            array[start] = reverseString(array[start]);
            // Printing the reversed and formatted string at the 'start' index
            System.out.println(array[start]);

            // Checking if 'start' and 'end' are not pointing to the same element
            // to avoid processing the same element twice
            if (start != end) {
                // Reversing and formatting the string at the 'end' index
                array[end] = reverseString(array[end]);
                // Printing the reversed and formatted string at the 'end' index
                System.out.println(array[end]);
            }
        }
    }
}






















/* 
public class hw8_InverseOrder {

    public static void main(String[] args) {

         String[] namearray  = {"Anne", "John", "Alex", "Jessica"};
         String[] planetarray = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter"};

        reverseArray(namearray);
        reverseArray(planetarray);

        for (String value : namearray ){
            System.out.println(value + " ");
        }

        for (String value : planetarray ){
            System.out.println(value + " ");
        }


        for(int i = 0; i < namearray.length; i++){
            namearray[i] = reverseString(namearray[i]);
        }
        for(int i = 0; i < planetarray.length; i++){
            planetarray[i] = reverseString(planetarray[i]);
        }

        System.out.println("Reversed Namestring:");
        for (String str : namearray){
            System.out.println(str);
        }
        System.out.println("Reversed Planetstring:");
        for (String str : planetarray){
            System.out.println(str);
        }    
        
    }
   


    

    public static String reverseString(String str){

        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while(start < end ){
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


        


    public static void reverseArray(String[] namearray){
        int start = 0 ;
        int end = namearray.length - 1;

        while (start < end ){
            String temp = namearray[start];
            namearray[start] = namearray[end];
            namearray[end] = temp; 

            start++;
            end--;
        }
    }

    public static void reverseArray(String[] planetarray){
        int start = 0 ;
        int end = planetarray.length - 1;

        while (start < end ){
            String temp = planetarray[start];
            planetarray[start] = planetarray[end];
            planetarray[end] = temp; 

            start++;
            end--;
        }
    }















    // public static void main(String[] args) {
    //     InverseOrder();
    // }


    // static void myMethod(){
    //     System.out.println("Hello World");
    // }

    // public static void main(String[] args) {
    //     myMethod();
    // }



}
*/
