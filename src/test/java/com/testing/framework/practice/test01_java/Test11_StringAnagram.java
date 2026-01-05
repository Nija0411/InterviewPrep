package com.testing.framework.practice.test01_java;

import java.util.Arrays;

public class Test11_StringAnagram {
    public static void main(String[] args) {
        String s1 = "Night";
        String s2 = "Thing";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        }

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("No");
        }
    }
}
