package com.testing.framework.practice.test01_java;

public class Test04_ReverseString {
    public static void main(String[] args) {
        String str = "Madam";
        str = str.toLowerCase();

        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

        if (reversed.equals(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
