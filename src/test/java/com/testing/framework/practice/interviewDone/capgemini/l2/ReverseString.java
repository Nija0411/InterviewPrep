package com.testing.framework.practice.interviewDone.capgemini.l2;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Nikhita Jalapure";
        //output = "atihkiN erupalaJ"
        String[] s = str.split(" ");

        String reversed = "";
        for (String name : s) {
            for (int i = name.length() - 1; i >= 0; i--) {
                reversed += name.charAt(i);
            }
            reversed += " ";
        }
        System.out.println(reversed + " ");
    }
}
