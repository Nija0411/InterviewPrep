package com.testing.framework.practice.interviewDone.siemens.t1;



public class CountObjects {
    static int count = 0;


    //WAP to count the total objects in the class
    CountObjects() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        CountObjects c1 = new CountObjects();
        CountObjects c2 = new CountObjects();
        CountObjects c3 = new CountObjects();
        CountObjects c4 = new CountObjects();
        CountObjects c5 = new CountObjects();

        System.out.println(getCount());
    }
}
