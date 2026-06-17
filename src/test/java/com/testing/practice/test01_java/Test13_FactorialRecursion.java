package com.testing.practice.test01_java;

public class Test13_FactorialRecursion {
    public static void main(String[] args) {
        int n = 5;

        int factorial = factorial(n);
        System.out.println(factorial);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


}
