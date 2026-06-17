package com.testing.practice.test01_java;

public class Test29_ValidPalindrome {
    //Check the Palindrome with 2 Pointer approach
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));

    }

    private static boolean isPalindrome(String input) {
        char[] a = input.toCharArray();
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(a[left])) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(a[right])) {
                right--;
            }
            if (Character.toLowerCase(a[left]) != Character.toLowerCase(a[right])) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
