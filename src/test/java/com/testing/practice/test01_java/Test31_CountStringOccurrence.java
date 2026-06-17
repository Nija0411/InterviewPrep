package com.testing.practice.test01_java;

public class Test31_CountStringOccurrence {

    //Count the string occurrence using StringBuilder
    public static void main(String[] args) {
        String str = "Java Automation";
        char ch[] = str.toCharArray();

        StringBuilder result = new StringBuilder();

        //Removes space and special characters
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetterOrDigit(ch[i])) {
                result.append(Character.toLowerCase(ch[i]));
            }
        }

        //Counting
        for (int i = 0; i < result.length(); i++) {
            int count = 1;
            if (result.charAt(i) == '0') {
                continue;
            }
            for (int j = i + 1; j < result.length(); j++) {
                if (result.charAt(i) == result.charAt(j)) {
                    count++;
                    result.setCharAt(j, '0');
                }
            }
            System.out.println(result.charAt(i) + " ------> " + count);
        }
    }
}
