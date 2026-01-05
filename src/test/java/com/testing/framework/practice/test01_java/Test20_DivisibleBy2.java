package com.testing.framework.practice.test01_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//WAP to return the numbers that are divisible by 2 from a given list java

public class Test20_DivisibleBy2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(getEvenNumbers(list));
    }

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }
}
