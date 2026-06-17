package com.testing.practice.test01_java.strings.reverseString;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Pprogrammming";

//        str = str.toLowerCase();
        char[] array = str.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Character.toLowerCase(array[i]) == Character.toLowerCase(array[j])) {
                    set.add(Character.toLowerCase(array[i]));
                    break;
                }
            }
        }
        System.out.println(set);
    }
}
