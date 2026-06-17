package com.testing.practice.test01_java;

import java.util.HashMap;
import java.util.Map;

public class Test07_StringWordOccurrences {
    public static void main(String[] args) {
        String str = "My name is Nikhita Jalapure and my interview is shceduled today";
        str = str.toLowerCase();

        String[] s = str.split(" ");

        Map<String, Integer> result = new HashMap<>();

        for (String word : s) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        System.out.println(result);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        }
    }
}
