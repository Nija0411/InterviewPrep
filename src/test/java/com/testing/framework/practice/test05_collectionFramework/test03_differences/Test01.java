package com.testing.framework.practice.test05_collectionFramework.test03_differences;

import java.util.ArrayList;

public class Test01 {
    //Difference between Arrays and ArrayList
    public static void main(String[] args) {
        arrays();
        arrayList();

    }

    public static void arrays() {
        //primitive declaraction
        int[] arr = new int[4];

        //non-primitive
        Integer arr1[] = new Integer[3];

        //add values
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        arr1[0] = 1;

        //accessing values
        System.out.println(arr[0]);
        System.out.println(arr[3]); //0
        System.out.println(arr1[2]);

        //Can't remove elements
    }

    public static void arrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1, 2);

        list.get(1); //fetch the value present at index 1

        list.remove(1); //remove the value present at index 1

    }
}
