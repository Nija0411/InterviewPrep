package com.testing.framework.practice.interviewDone.accolite;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String name = "Nikhita";
        name = name.toLowerCase();

        Map<Character, Integer> mapArray = new HashMap<>();

        for (char ch : name.toCharArray()) {
            if (mapArray.containsKey(ch)) {
                mapArray.put(ch, mapArray.get(ch) + 1);
            } else {
                mapArray.put(ch, 1);
            }
        }
        System.out.println(mapArray);

        //Duplicates
        for (Map.Entry<Character, Integer> entry : mapArray.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        }
    }
}
