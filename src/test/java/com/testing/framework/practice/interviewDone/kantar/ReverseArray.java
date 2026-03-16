package com.testing.framework.practice.interviewDone.kantar;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String input[] = {"Raj", "Vinod", "Kalyan"};
        String output[] = new String[input.length];

        int j = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder(input[i]);
            String reversed = sb.reverse().toString();

            reversed = reversed.substring(0, 1).toUpperCase() + reversed.substring(1).toLowerCase();

            output[j++] = reversed;

        }
        System.out.println(Arrays.toString(output));

    }
}
