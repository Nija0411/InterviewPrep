package com.testing.framework.practice.test05_collectionFramework.test02LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Test01_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList.get(2)); //3

        linkedList.addLast(5);
        linkedList.addFirst(0);

        System.out.println(linkedList);

        linkedList.getFirst(); //0
        linkedList.getLast(); //1

        linkedList.remove(1);
        linkedList.removeFirst();
        linkedList.removeLast();

        linkedList.add(1);
        linkedList.removeFirstOccurrence(1); //remove 1st 1

        linkedList.add(4);
        linkedList.removeLastOccurrence(4);

        linkedList.removeLastOccurrence(4);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Cow","Elephant"));
        LinkedList<String> anotherAnimals = new LinkedList<>(Arrays.asList("Cat","Dog"));

        //works with ArrayList too
        animals.removeAll(anotherAnimals);
        System.out.println(animals);


    }
}
