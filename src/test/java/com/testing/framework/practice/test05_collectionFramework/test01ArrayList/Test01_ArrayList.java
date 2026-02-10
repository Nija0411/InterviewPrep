package com.testing.framework.practice.test05_collectionFramework.test01ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test01_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(10);
        System.out.println(list.get(2)); //10
        System.out.println(list.size());

        for (int num : list) {
            System.out.println(num); //1 5 10
        }

        for (int i=0; i< list.size()-1;i++) {
            System.out.println(list.get(i)); //1 5 10
        }

        System.out.println(list.contains(5)); //true
        System.out.println(list.contains(50)); //false

//        list.remove(2); //index 2 item is removed

        list.add(2,50); //50 is added at index 2
        System.out.println(list);

        list.set(1,20); //replaces 1st index with 20
        System.out.println(list);
    }
}
