package com.testing.framework.practice.test01_java;

public class Test02_CountStringOccurrence {
    public static void main(String[] args) {
        String str = "Java Automation";
        str = str.toLowerCase().replaceAll("\\s", "");

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int count = 1;

            if (charArray[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                    charArray[j] = '0';
                }
            }
            if (count > 1) {
                System.out.println(charArray[i] + " visited " + count + " times.");
            }
        }
    }
}
