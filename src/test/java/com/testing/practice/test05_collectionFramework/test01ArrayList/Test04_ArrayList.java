package com.testing.practice.test05_collectionFramework.test01ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test04_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        list.remove(1); //removes element at index 1 (2nd element)
        list.remove(Integer.valueOf(5)); //will remove value 5
        System.out.println(list);

        List<String> list1 = new ArrayList<>(Arrays.asList("Sun", "Mon", "Tue", "Wed"));
        list1.remove("Sun");
        list1.remove(1);
        System.out.println(list1);

//        Object[] array = list.toArray();
        Integer[] arr = list.toArray(new Integer[0]); //0 just to mention that which type of array we need

        System.out.println(Arrays.toString(arr));

//        Why use new Integer[0]?
//        Java uses the runtime type of the array to determine the return type.
//        Size 0 is fine — JVM creates a new correctly sized array internally.


    }
}
