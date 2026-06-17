package com.testing.practice.test01_java.strings.reverseString;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "Programming";

        char[] array = str.toCharArray();
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    System.out.println(array[j]);
                    break;
                }
            }
        }
    }
}
