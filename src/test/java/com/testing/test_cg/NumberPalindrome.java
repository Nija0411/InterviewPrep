package com.testing.test_cg;

/**
 * Simple program to check whether a number is a palindrome.
 *
 * A number is a palindrome if it reads the same forwards and backwards.
 * This implementation avoids converting the number to a string and instead
 * reverses the digits numerically.
 */
public class NumberPalindrome {

    /**
     * Returns true if n is a palindrome number.
     * Negative numbers are not considered palindromes.
     */
    public static boolean isPalindrome(int n) {
        if (n < 0) return false; // negative numbers have a '-' sign
        int original = n;
        long reversed = 0; // use long to guard against overflow for large ints

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed == original;
    }

    public static void main(String[] args) {
        int[] tests = {121, -121, 12321, 123, 10, 0, 1, 2147447412};

        System.out.println("Number Palindrome Checker\n");
        for (int t : tests) {
            System.out.printf("%d -> %s%n", t, isPalindrome(t) ? "Palindrome" : "Not palindrome");
        }
    }
}

