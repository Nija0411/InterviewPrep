package com.testing.practice.test01_java.strings.reverseString;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Java Automation";
        str = str.toLowerCase().replaceAll("\\s", "");

        char ch[] = str.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        System.out.println(set);
    }
}
