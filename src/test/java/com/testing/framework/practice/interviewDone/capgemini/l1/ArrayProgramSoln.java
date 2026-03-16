package com.testing.framework.practice.interviewDone.capgemini.l1;

public class ArrayProgramSoln {
    public static void main(String[] args) {
        int input[] = {1, 2, 3};
        int input1[] = {4, 5, 6};

        int n = input.length;

        System.out.print("{");
        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + "+" + input1[n - 1 - i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
