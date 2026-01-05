package com.testing.framework.practice.test01_java;

public class Test15_FindMissingNumberInArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5};

        int n = arr.length + 1;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int expectedSum = (n * (n + 1)) / 2;
        int missingNumber = expectedSum - sum;
        System.out.println(missingNumber);
    }
}
