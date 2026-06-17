package com.testing.practice.test01_java.concepts;

public class StaticKeyword {
    static int a = 10;
    int b = 20;

    public static void test() {
        a = 20;
//      b = 30; Compile Error
//      StaticKeyword.b = 30; Compile error

        //Create object to access non-static variable
        StaticKeyword obj = new StaticKeyword();
        obj.b = 30;

        System.out.println(a);
        System.out.println(obj.b);
    }

    public static void main(String[] args) {
        test();
    }
}
