package com.testing.practice.test01_java;

public class Test01_CountEachOccurrenceInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3};

        boolean visited[] = new boolean[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (visited[i]) {
                continue;
            }

            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " ----> " + count);
        }
    }
}
