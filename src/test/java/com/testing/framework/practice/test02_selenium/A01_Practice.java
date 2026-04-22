package com.testing.framework.practice.test02_selenium;


public class A01_Practice {
    public static void main(String[] args) {
        String input = "Java Test";

        String[] arr = input.split(" ");

        String reverse = "";
        for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            reverse += " ";

        }
        System.out.println(reverse);


    }
}



