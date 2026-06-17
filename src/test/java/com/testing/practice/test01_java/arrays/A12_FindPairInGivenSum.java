package com.testing.practice.test01_java.arrays;

public class A12_FindPairInGivenSum {
    public static void main(String[] args) {
        /*[2,4,7,11]
           Target = 9
         */

        int arr[] = {2, 4, 7, 11};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    break;
                }
            }
        }

    }
}
