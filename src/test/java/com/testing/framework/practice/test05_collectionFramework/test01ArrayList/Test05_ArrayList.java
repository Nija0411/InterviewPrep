package com.testing.framework.practice.test05_collectionFramework.test01ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test05_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1);
//        list.add("String");

        Collections.sort(list);
        System.out.println(list);

        list.sort(null); //also sorts

        List<String> list1 = Arrays.asList("banana", "apple", "date");
        list1.sort(null); //ascending sort

    }
}
