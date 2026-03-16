package com.testing.framework.practice.test01_java;

public class Test04_ReverseString {
    public static void main(String[] args) {
        String str = "Madam";

        char[] ch = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = ch.length-1; i >= 0; i--) {
            sb.append(ch[i]);
        }

        System.out.println(sb);
        reverseString();
    }

    //Regular Method
    public static void reverseString(){
        String str = "Hello Madam";
        String reversed = "";
        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
    }
}
