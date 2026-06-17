package com.testing.practice.test01_java.strings.reverseString;

import java.util.Scanner;

public class WithoutSB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input: ");
        String str = input.next();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}
