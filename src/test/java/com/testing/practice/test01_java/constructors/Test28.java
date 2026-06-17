package com.testing.practice.test01_java.constructors;

public class Test28 {

    //copy constructor
    //A constructor takes the reference of an object of the same class as a parameter.

    String name;

    //Parameterized constructor
    public Test28(String name) {
        this.name = name;
    }

    public Test28(Test28 test) {
        this.name = test.name;
    }

    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        Test28 t1 = new Test28("Java");
        System.out.println(t1);

        Test28 t2 = new Test28(t1);
        System.out.println(t2);
    }
}
