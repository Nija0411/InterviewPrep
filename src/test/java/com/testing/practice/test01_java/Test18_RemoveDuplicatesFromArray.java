package com.testing.practice.test01_java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test18_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 3, 4, 5, 6, 2, 5, 4};

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        Integer[] array = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(array));
    }
}
