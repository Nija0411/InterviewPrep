package com.testing.framework.practice.test01_java;


import java.util.Scanner;

public class Test13_FactorialRecursion {
    public static void main(String[] args) {

        System.out.println("Enter a Number to calculate factorial: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int factorial = Test13_FactorialRecursion.factorial(n);
        System.out.println(factorial);

    }

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
