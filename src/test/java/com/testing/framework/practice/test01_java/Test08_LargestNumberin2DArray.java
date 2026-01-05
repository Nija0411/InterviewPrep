package com.testing.framework.practice.test01_java;

public class Test08_LargestNumberin2DArray {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 500}, {200, 300, 600, 800}};

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
