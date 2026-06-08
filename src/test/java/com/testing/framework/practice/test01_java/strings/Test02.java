package com.testing.framework.practice.test01_java.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//WAP to find the first non-repeating character from String Programming
public class Test02 {
    public static void main(String[] args) {
        String str = "Pprogramming";

        //Use LinkedHashMap as it maintains insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            char c = Character.toLowerCase(ch);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        System.out.println(map);
        for (char ch : str.toCharArray()) {
            char c = Character.toLowerCase(ch);
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }


//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//                break;
//            }
//        }


    }
}
