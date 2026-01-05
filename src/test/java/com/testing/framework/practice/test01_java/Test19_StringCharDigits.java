package com.testing.framework.practice.test01_java;

public class Test19_StringCharDigits {
    public static void main(String[] args) {
        //Separate characters and digits from an input string in an online editor.

        String str = "abc123456def";

        String alpha = "";
        String num = "";

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alpha += ch;
            } else {
                num += ch;
            }
        }

        System.out.println("Characters: " + alpha);
        System.out.println("Digits: " + num);
    }
}
