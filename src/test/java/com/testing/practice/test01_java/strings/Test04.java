package com.testing.practice.test01_java.strings;

public class Test04 {
      //    write a java program to reverse a string without affecting special characters
     //     Input: a,b$c
    //    Output: c,b$a
    public static void main(String[] args) {
        String str = "a,b$c";

        String letters = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                letters += str.charAt(i);
            }
        }

        int index = 0;
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                reversed += letters.charAt(index++);
            } else {
                reversed += str.charAt(i);
            }
        }
        System.out.println(reversed);
    }
}
