package com.testing.framework.practice.test01_java.arrays;

public class A08_FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};

        int n = arr.length + 1;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int expectedSum = (n*(n+1))/2; //30/2 = 15
        int missingNumber = expectedSum-sum; //15-11
        System.out.println(missingNumber); //4
    }
}
