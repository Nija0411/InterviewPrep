package com.testing.framework.practice.test01_java;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Test26_SortArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 2, 3, 4, 1, 2, 5, 3};

        Set<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        Integer[] array = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }
}
