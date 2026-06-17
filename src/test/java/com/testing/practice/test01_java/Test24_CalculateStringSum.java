package com.testing.practice.test01_java;

public class Test24_CalculateStringSum {

    //Caluclate the sum of the digits from the given string
    //12+34+56+10 = 112
    //https://www.youtube.com/watch?v=y3yVNmQ-qkQ

    public static void main(String[] args) {
        String str = "12abc34xyz56lmn10";

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        //This if is only needed when you have digits at the last
        if (sb.length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }
        System.out.println(sum);
    }
}
