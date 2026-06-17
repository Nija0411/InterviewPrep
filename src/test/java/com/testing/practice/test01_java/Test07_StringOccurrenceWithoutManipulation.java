package com.testing.practice.test01_java;

import java.util.HashMap;
import java.util.Map;

public class Test07_StringOccurrenceWithoutManipulation {
    public static void main(String[] args) {
        String str = "My name is Nikhita Jalapure and my interview is shceduled today";

        Map<String, Integer> map = new HashMap<>();

        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + Character.toLowerCase(str.charAt(i));
            } else {
                if (!word.equals("")) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);

        System.out.println("Duplicates");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " ----> " + entry.getValue());
            }
        }
    }
}