package com.testing.practice.test01_java.strings;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurrences {
    public static void main(String[] args) {
        String str = "Java is good java is easy";
        str = str.toLowerCase();
        String[] s = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : s) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);

        for(Map.Entry<String, Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }

}
