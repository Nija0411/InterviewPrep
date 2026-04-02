package com.testing.framework.practice.test01_java.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class A07_RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        Integer[] array = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(array));
    }
}
