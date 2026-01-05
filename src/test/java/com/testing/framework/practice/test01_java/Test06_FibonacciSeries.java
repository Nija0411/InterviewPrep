package com.testing.framework.practice.test01_java;

public class Test06_FibonacciSeries {
    public static void main(String[] args) {
        int n = 5;

        int first = 0;
        int second = 1;
        System.out.print(first + ", " + second);

        for (int i = 2; i <= n; i++) {
            int third = first + second;
            System.out.print(", " + third);
            first = second;
            second = third;
        }
    }
}
