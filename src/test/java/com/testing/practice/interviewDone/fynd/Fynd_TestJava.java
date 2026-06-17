package com.testing.practice.interviewDone.fynd;

public class Fynd_TestJava {
    public static void main(String[] args) {
        //"This is your interview"

        String str = "This is your interview and Abhishek is taking it";
//        str[] = Arrays.toString(str.split(" "));


        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            int count = 1;
            if (ch[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < ch.length - 1; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0';
                }
            }
            System.out.println( ch[i]+" " + count);
        }
    }
}
