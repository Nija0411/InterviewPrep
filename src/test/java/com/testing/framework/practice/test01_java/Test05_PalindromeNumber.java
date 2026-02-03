package com.testing.framework.practice.test01_java;

public class Test05_PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int original = n;

        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
