package com.testing.framework.practice.test01_java;

import java.util.ArrayList;
import java.util.List;

public class Test35_EYStringManipulation {
    public static void main(String[] args) {
        String input = "a1b2c3"; //a3b2c1

        List<Character> list = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                list.add(c);
            }
        }

        int index = list.size() - 1;
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if(Character.isDigit(c)){
                sb.append(list.get(index));
                index--;
            }else {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
