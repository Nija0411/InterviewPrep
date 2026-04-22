package com.testing.framework.practice.test01_java;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test38_StreamsExample {

    //Print the numbers starting from 1 in a List
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 22, 32, null, 100, 123);

        List<Integer> list1 = list.stream()
                .filter(i -> Objects.nonNull(i))
                .filter(i -> i.toString().startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(list1);
    }
}
