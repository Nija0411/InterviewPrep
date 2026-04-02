package com.testing.framework.practice.test01_java.arrays;

import java.util.HashMap;
import java.util.Map;

public class A06_DuplicateElementsUsingMap {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 5, 3};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.print("Duplicates: ");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }

    }
}
