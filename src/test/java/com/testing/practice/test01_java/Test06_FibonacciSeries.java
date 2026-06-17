package com.testing.practice.test01_java;

public class Test06_FibonacciSeries {
    public static void main(String[] args) {
        int n = 6;

        int first = 0;
        int second = 1;
        System.out.print(first + ", " + second);

        int sum = first + second;

        for (int i = 2; i < n; i++) {
            int third = first + second;
            System.out.print(", " + third);
            sum += third;
            first = second;
            second = third;
        }
        System.out.println();
        System.out.println(sum);
    }
}
