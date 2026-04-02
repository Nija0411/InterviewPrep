package com.testing.framework.practice.test01_java.arrays;

public class A01_MaxElement {
    public static void main(String[] args) {
        int arr[] = {3, 7, 2, 9, 5};

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
