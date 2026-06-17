package com.testing.practice.test01_java.strings;

public class Test03 {
    public static void main(String[] args) {
        String str = "Make It Real";
        //Output = M.I.Real

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        result.append(words[0].charAt(0)).append('.');
        result.append(words[1].charAt(0)).append('.');
        result.append(words[2]);

        System.out.println(result.toString());

    }
}
