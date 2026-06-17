package com.testing.practice.interviewDone.mathco;

public class Vowels {
    public static void main(String[] args) {
        String str = "Nikhita";
        str = str.toLowerCase();

//        char[] result = str.toCharArray();
        String replace = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                replace += "#";
            } else {
                replace += ch;
            }

        }
        System.out.println(replace);
    }
}
