package com.testing.framework.practice.test01_java;

public class Test13_FactorialRecursion {
    public static void main(String[] args) {
        int n = 5;

        int factorial = factorial1(n);
        System.out.println(factorial);
    }

    public static int factorial1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial1(n - 1);
    }


}
