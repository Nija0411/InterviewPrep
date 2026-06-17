package com.testing.practice.test01_java.arrays;

import java.util.HashSet;

public class A05_DuplicateElementsUsingSet {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,5,3};
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Duplicates: ");
        for(int i=0; i< arr.length; i++){
            if(!set.add(arr[i])){
                System.out.print(arr[i] +" ");
            }
        }
    }
}
