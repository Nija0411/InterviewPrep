package com.testing.framework.practice.test01_java;

import java.util.Arrays;

public class Test27_ReverseArray {
    public static void main(String[] args) {

        //The same question can be done with Strings
        String str = "Hello";
        char[] charArray = str.toCharArray();

        //For arrays
        int a[] = {1, 2, 3};

        int left = 0;
        int right = a.length-1;
        int temp;

        while (left < right) {
            //swap
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }
}
