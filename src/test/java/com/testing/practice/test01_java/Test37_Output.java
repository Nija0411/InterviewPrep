package com.testing.practice.test01_java;

public class Test37_Output {
    public static void func(int a, int b){
        int ans = 1;

        for(int i=0; i<b; i++){
            ans *= a;
        }
        System.out.print(ans);
    }

    public static void main(String[] args) {
        func(2,5);
    }
}
