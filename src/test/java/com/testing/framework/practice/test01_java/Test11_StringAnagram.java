package com.testing.framework.practice.test01_java;

import java.util.Arrays;

public class Test11_StringAnagram {
    public static void main(String[] args) {
        String str1 = "Night";
        String str2 = "Thing";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("Not a Anagram");
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }else {
            System.out.println("No");
        }
    }
}
