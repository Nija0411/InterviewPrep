package com.testing.practice.test01_java;

import java.util.Arrays;

public class Test17_RotateArrayLeft {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        //Right Logic
        // 1. reverse(arr, 0, arr.length)
        // 2. reverse(arr, 0, k-1)
        // 3. reverse(arr, k, arr.length)

        //Left Logic
        // 1. reverse(arr, 0, k-1)
        // 2. reverse(arr, k, arr.length)
        // 3. reverse(arr, 0, arr.length)

        k %= arr.length; //Useful when K > arr.length

        Test17_RotateArrayLeft.rotateLeft(arr, 0, k - 1);
        Test17_RotateArrayLeft.rotateLeft(arr, k, arr.length-1);
        Test17_RotateArrayLeft.rotateLeft(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void rotateLeft(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
