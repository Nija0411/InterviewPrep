package com.testing.practice.test01_java;

public class Test25_SwapStrings {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap without using third variable
        a = a + b; //HelloWorld
        b = a.substring(0, a.length() - b.length()); // (10-5) starting from 0 and ends before 5
        a = a.substring(b.length());

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

