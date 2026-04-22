package com.testing.framework.practice.test01_java.arrays;

import java.util.Arrays;

public class A13_SortArray {
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 1, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //Using 3rd variable
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;

                    //Without third variable
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
