package com.testing.practice.interviewDone.synechron;

public class Overloading {

    public static void main(String[] args) {
        Overloading.sum(10, 20);//30
    }

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    public static void sum(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }

}
