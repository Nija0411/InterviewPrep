package com.testing.framework.practice.interviewDone.synechron;

public class Overriding_Child extends Overriding_Super {

    @Override
    public void hello() {
        System.out.println("Hello From Child");
    }

    public static void main(String[] args) {
        Overriding_Child obj = new Overriding_Child();
        obj.hello(); //Child

        Overriding_Super sObj = new Overriding_Super();
        sObj.hello(); //Super

        Overriding_Super cObj = new Overriding_Child(); //Runtime Polymorphism/Dynamic Method Dispatch
        cObj.hello(); //Child

//       Overriding_Child cObjj = new Overriding_Super();


    }
}
