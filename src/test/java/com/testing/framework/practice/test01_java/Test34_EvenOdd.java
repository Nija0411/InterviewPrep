package com.testing.framework.practice.test01_java;

public class Test34_EvenOdd {
    public static void main(String[] args) {
        //Find the number is even or odd without using % operator

        int num = 6;

        while (num > 1) {
            num -= 2;
        }
        if (num == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
