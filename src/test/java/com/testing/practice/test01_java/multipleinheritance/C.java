package com.testing.practice.test01_java.multipleinheritance;

public class C implements A, B {
    public static void main(String[] args) {

        C c = new C();
        c.display();
        c.show();
    }

    @Override
    public void display() {
        System.out.println("Display from A");
    }

    @Override
    public void show() {
        System.out.println("Show from B");
    }
}
