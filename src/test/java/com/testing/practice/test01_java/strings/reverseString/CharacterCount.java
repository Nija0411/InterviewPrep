package com.testing.practice.test01_java.strings.reverseString;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Selenium";
        char ch = 'e';

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(ch + " : " + count);
    }
}
