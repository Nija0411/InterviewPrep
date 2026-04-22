package com.testing.framework.practice.test01_java.strings;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Java Test";
        //Output = avaJ tseT, without using 3rd variable

        String[] words = input.split(" ");

        for (String word : words) {
            char[] array = word.toCharArray();

            int left = 0;
            int right = array.length - 1;

            while (left < right) {
                array[right] = (char) (array[left] ^ array[right]);
                array[left] = (char) (array[left] ^ array[right]);
                array[right] = (char) (array[left] ^ array[right]);

                left++;
                right--;
            }
            System.out.print(new String(array) + " ");

        }


    }
}
