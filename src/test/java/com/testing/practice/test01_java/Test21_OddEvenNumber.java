package com.testing.practice.test01_java;

//WAP to determine if a number is odd or even without using bitwise operators or the modulus operator
public class Test21_OddEvenNumber {
    public static void main(String[] args) {
        int num = 7;

        if ((num / 2) * 2 == num) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
