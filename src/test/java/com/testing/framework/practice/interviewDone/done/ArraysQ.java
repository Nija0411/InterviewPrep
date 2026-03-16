package com.testing.framework.practice.interviewDone.done;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysQ {
    public static void main(String[] args) {
        //[1,2,3,6] asked to insert 4 and 5 after 3

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 6));
        list.add(3, 4);
        list.add(4, 5);

        System.out.println(list);

    }
}
