package com.testing.practice.test01_java.strings.reverseString;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input: ");
        String str = input.next();

        String reversed = new StringBuilder(str).reverse().toString();

        if(reversed.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("No");
        }
    }
}
