package com.testing.framework.practice.test01_java;

import static java.lang.Math.max;

public class Test09_MaxSubArray {
    public static void main(String[] args) {
        //WAP to find the maximum sum subarray.-->https://www.youtube.com/watch?v=9IZYqostl2M&t=378s
        int arr[] = {2, 3, -4, 5, -7, -8, 9, 0, 12};

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maxSum = max(currentSum, maxSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
