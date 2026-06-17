package com.testing.practice.test01_java.concepts;

//Create private static instance of the class
//Create private constructor
//Create public method to access the instance


public class SingletonClass {
    private static SingletonClass obj;

    private SingletonClass() {
    }

    public static SingletonClass getInstance(SingletonClass obj) {
        obj = new SingletonClass();
        return obj;
    }
}
