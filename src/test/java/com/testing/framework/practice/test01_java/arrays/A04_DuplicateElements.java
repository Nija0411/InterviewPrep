package com.testing.framework.practice.test01_java.arrays;

public class A04_DuplicateElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,5,3};

        System.out.print("Duplicate Elements: ");
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
