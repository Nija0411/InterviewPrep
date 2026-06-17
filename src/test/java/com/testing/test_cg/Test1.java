package com.testing.test_cg;

public class Test1 {

    // Method to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = reverseString(cleaned);
        return cleaned.equals(reversed);
    }

    // Main method to test the program
    public static void main(String[] args) {
        String[] testStrings = {
            "racecar",
            "hello",
            "A man a plan a canal Panama",
            "12321",
            "madam",
            "java"
        };

        System.out.println("=== String Reversal and Palindrome Checker ===\n");

        for (String str : testStrings) {
            String reversed = reverseString(str);
            boolean isPalin = isPalindrome(str);

            System.out.println("Original String: " + str);
            System.out.println("Reversed String: " + reversed);
            System.out.println("Is Palindrome: " + isPalin);
            System.out.println();
        }
    }
}
