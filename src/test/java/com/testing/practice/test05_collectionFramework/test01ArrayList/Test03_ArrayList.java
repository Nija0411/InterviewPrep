package com.testing.practice.test05_collectionFramework.test01ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test03_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0,0);

        List<Integer> list1 = List.of(5,6,7,8,9);

        list.addAll(list1);
        System.out.println(list);

        list1.addAll(list); //Exception, List.of is unmodifiedable
    }
}
