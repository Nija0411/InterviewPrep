package com.testing.practice.test01_java.strings.reverseString;

public class UsingSB {
    public static void main(String[] args) {
        String str = "Java";

        StringBuilder sb = new StringBuilder(str).reverse();
        String reversed = sb.toString();
        System.out.println(reversed.toLowerCase());


    }
}
