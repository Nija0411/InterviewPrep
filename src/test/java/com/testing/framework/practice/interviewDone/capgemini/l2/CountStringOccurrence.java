package com.testing.framework.practice.interviewDone.capgemini.l2;

import java.util.HashMap;
import java.util.Map;

public class CountStringOccurrence {
    public static void main(String[] args) {
        String arr[] = {"apple", "banana"};

        Map<Character, Integer> mapArray = new HashMap<>();

        for (String fruit : arr) {
            for (int i = 0; i < fruit.length(); i++) {
                char ch = fruit.charAt(i);
                if (mapArray.containsKey(ch)) {
                    mapArray.put(ch, mapArray.get(ch) + 1);
                } else {
                    mapArray.put(ch, 1);
                }
            }
        }
        System.out.println(mapArray);
    }
}



