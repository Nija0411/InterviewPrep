package com.testing.framework.practice.test01_java;

import java.util.Arrays;

public class Test30_ArrayManipulation {
    //Input = ["Anidita", "is", "in", "the", "interview"]
    //Output = ["Anidita", "the", "in", "is", "interview"]
    public static void main(String[] args) {
        String[] input = {"Anidita", "is", "in", "the", "interview"};

        arrManipulation(input);
        System.out.println(Arrays.toString(input));

    }

    private static void arrManipulation(String[] input) {
        int left = 1;
        int right = input.length - 2;
        String temp;

        while (left < right) {
            temp = input[left];
            input[left] = input[right];
            input[right] = temp;

            left++;
            right--;
        }

    }
}
