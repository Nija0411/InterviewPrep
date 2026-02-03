package com.testing.framework.practice.test01_java;

public class Test01_CountEachOccurrenceInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4};

        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (visited[i]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " --> " + count);
        }
    }
}
