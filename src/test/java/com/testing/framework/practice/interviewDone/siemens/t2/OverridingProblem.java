package com.testing.framework.practice.interviewDone.siemens.t2;

public class OverridingProblem {

    public void show(){
        System.out.println("This is a parent class method");
    }
}

class Child extends OverridingProblem{
    public void show(){
        System.out.println("This is a child class method");
    }
}

class Runner{
    public static void main(String[] args) {
        OverridingProblem obj = new Child(); //Upcasting
        obj.show();
    }
}
