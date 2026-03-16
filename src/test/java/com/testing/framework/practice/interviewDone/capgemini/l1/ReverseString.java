package com.testing.framework.practice.interviewDone.capgemini.l1;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Automation";

        //output = noitamotuA avaJ

        StringBuilder sb = new StringBuilder(str);
        String reversed = "";
        for (int i = sb.length() - 1; i >= 0; i--) {
            reversed += sb.charAt(i);
        }
        System.out.println(reversed.toString());
    }
}
