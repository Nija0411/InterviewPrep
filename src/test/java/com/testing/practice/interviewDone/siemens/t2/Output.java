package com.testing.practice.interviewDone.siemens.t2;

public class Output {
        static int x;

        // 1️⃣ Static Block (acts like static constructor in Java)
        static {
            x = 5;
            System.out.println("Static Block: " + x);
        }

        // 2️⃣ Public Default Constructor
        public Output() {
            x = 10;
            System.out.println("Public Constructor: " + x);
        }

        // 3️⃣ Parameterized Constructor
        public Output(int value) {
            x = value;
            System.out.println("Parameterized Constructor: " + x);
        }

        public static void main(String[] args) {
//            Output t1 = new Output(15);
            Output t2 = new Output();
        }
    }

