package com.testing.framework.practice.test01_java.arrays;

import java.util.HashMap;

public class A09_FrequencyofElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);
    }
}
