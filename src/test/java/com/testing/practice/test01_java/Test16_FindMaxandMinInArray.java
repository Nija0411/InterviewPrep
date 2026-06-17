package com.testing.practice.test01_java;

public class Test16_FindMaxandMinInArray {
    public static void main(String[] args) {
        int arr[] = {30, 200, 500, 100};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
