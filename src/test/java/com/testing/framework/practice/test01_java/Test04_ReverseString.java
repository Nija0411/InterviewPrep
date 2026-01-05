package com.testing.framework.practice.test01_java;

public class Test04_ReverseString {
    public static void main(String[] args) {
        String str = "Madam";

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

        if (str.toLowerCase().equals(reversed.toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
