package com.testing.framework.practice.interviewDone.capgemini.l2;

public class Output {
    public static void main(String[] args) {
        try {
            System.out.println("s");
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("r");
        } finally {
            System.out.println(1);
        }
        System.out.printf("-1");
    }
}
