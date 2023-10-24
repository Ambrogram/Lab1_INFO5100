package edu.neu.mgen;

public class ArrayManipulation_HW5_5 {
    public static void main(String[] args) {
        int[] abc = {1,3,5,2,5};

        // 1. Find the length of the array
        int length = abc.length;
        System.out.println("Length of the array: " + length);

        // 2. Find the last member of the array
        int lastMember = abc[abc.length - 1];
        System.out.println("Last member of the array: " + lastMember);
    }
}

