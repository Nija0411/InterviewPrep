package com.testing.framework.practice.test05_collectionFramework.test01ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Creating an ArrayList
public class Test02_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        //asList() is method with fixed size, we can't perform add/remove
        List<String> list1 = Arrays.asList("Monday", "Tuesday", "Wed");
//        list1.add("Thu"); //Exception
//        list1.remove(1); //Exception
        list1.set(1, "Sun"); //Accepted
        System.out.println(list1);
        System.out.println(list1.getClass().getName());

        String arr[] = {"Sun", "Mon", "Tue"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2.getClass().getName());

        //Unmodifiedable method we can't even perform set
        List<Integer> list3 = List.of(1, 2, 3, 4);
//        list1.add(5); //Exception
//        list1.remove(1); //Exception
//        list1.set(1, 10); //Exception

    }
}
