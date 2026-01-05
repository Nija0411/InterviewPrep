package com.testing.framework.practice.test01_java;

import java.util.Arrays;

public class Test12_RotateArrayRight {
    public static void main(String[] args) {
        //WAP to rotate an array by K positions.
        //Right rotate

        //Full reverse = rev(arr[], 0-arr.length-1)
        //Reverse K    = rev(arr[], 0-k-1)
        //Reverse remained = rev(arr[], k-arr.length-1)

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        k %= arr.length; //Useful when K>arr.length

        Test12_RotateArrayRight r = new Test12_RotateArrayRight();

        r.reverse(arr, 0, arr.length - 1);
        r.reverse(arr, 0, k - 1);
        r.reverse(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
