package com.testing.framework.practice.test01_java;

import java.util.Arrays;

public class Test28_ValidPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        StringBuilder sb = new StringBuilder();

        char array[] = input.toCharArray();
        for (char c : array) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String original = sb.toString();
        String reversed = sb.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Invalid Palindrome");
        }
    }
}
