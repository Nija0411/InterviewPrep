package com.testing.framework.practice.test01_java;

import java.util.HashMap;
import java.util.Map;

public class Test03_StringCountUsingMap {
    public static void main(String[] args) {
        String str = "Automation";
        str = str.toLowerCase().replaceAll("\\s", "");

        Map<Character, Integer> result = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (result.containsKey(ch)) {
                result.put(ch, result.get(ch) + 1);
            } else {
                result.put(ch, 1);
            }
        }
        System.out.println(result);

        System.out.println("Duplicate Elements");
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        }
    }
}
