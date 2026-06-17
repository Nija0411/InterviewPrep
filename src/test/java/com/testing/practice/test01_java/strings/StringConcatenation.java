package com.testing.practice.test01_java.strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "20,";
        String s2 = "10";

        //Integer.parseInt() returns a primitive int
        int result = Integer.parseInt(s1.replaceAll(",", "")) + Integer.parseInt(s2);
        System.out.println(result);

        //Integer.valueOf() returns an Integer object (auto-unboxed to int here)
        int result1 = Integer.valueOf(s1.replaceAll(",", "")) + Integer.valueOf(s2);
        System.out.println(result1);
    }
}
