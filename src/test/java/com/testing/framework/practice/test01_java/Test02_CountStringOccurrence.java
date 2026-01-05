package com.testing.framework.practice.test01_java;

public class Test02_CountStringOccurrence {
    public static void main(String[] args) {
        String str = "Java";
        str = str.toLowerCase().replaceAll("\\s", "");

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (ch[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0';
                }
            }
            System.out.println(ch[i] + " --> " + count);
        }
    }
}
