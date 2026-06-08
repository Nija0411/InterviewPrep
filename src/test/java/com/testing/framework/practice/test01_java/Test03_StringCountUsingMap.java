package com.testing.framework.practice.test01_java;

import java.util.HashMap;
import java.util.Map;

public class Test03_StringCountUsingMap {
    public static void main(String[] args) {
        String str = "" +
                "" +
                "Test Automation";

        str = str.toLowerCase().replaceAll("\\s", "");

        Map<Character, Integer> mapArray = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if (mapArray.containsKey(ch)) {
                mapArray.put(ch, mapArray.get(ch) + 1);
            } else {
                mapArray.put(ch, 1);
            }
        }
        System.out.println(mapArray);

        for (Map.Entry<Character, Integer> entry : mapArray.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        }



    }
}
