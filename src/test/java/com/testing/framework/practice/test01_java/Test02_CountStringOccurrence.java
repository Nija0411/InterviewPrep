package com.testing.framework.practice.test01_java;

public class Test02_CountStringOccurrence {
    public static void main(String[] args) {
        String str = "Java Automation";

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' || arr[i] == '0') {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (Character.toLowerCase(arr[i]) == Character.toLowerCase(arr[j])) {
                    count++;
                    arr[j] = '0';
                }
            }
            System.out.println(arr[i] + " : " + count);
        }
    }
}
