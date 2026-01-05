package com.testing.framework.practice.test01_java;

import java.util.*;
import java.util.stream.Collectors;

public class Test10_DuplicateElementsUsingStream {
    public static void main(String[] args) {
        //Do a chat gpt for explanation

        List<Integer> list = Arrays.asList(1, 2, 3, 3, 1);
        Set<Integer> duplicateElements =
                list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println(duplicateElements);

        //We use List because Lists allow duplicates, which makes it possible to detect and count repeated elements.
        //Arrays.asList() is used to quickly create a list for processing.
        //We cannot use Set because sets do not allow duplicates, so we cannot detect repeated values from them.

    }
}
