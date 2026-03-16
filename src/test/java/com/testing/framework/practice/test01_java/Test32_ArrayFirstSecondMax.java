package com.testing.framework.practice.test01_java;

import java.util.Arrays;
import java.util.List;

public class Test32_ArrayFirstSecondMax {
    public static void main(String[] args) {

        //If list
       // List<Integer> list = Arrays.asList(10, 20, 45, 5);

        int arr[] = {10, 20, 45, 5};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num > secondMax && num <= max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num <= secondMax) {
                thirdMax = num;

            }
        }
        System.out.println(max);
        System.out.println(secondMax);
        System.out.println(thirdMax);
    }
}
