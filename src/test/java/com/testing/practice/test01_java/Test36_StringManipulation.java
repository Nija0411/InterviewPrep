package com.testing.practice.test01_java;

public class Test36_StringManipulation {
    public static void main(String[] args) {
        String input = "r@56vi ku$%mar67"; //rvi kumar 24

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) || c == ' ') {
                sb.append(c);
            } else if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);

            }
        }
        sb.append(" ");
        sb.append(sum);
        System.out.println(sb);
    }
}
