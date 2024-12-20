package com.java.practice.innerclass;

public class MethodInnerClass {

    private String x = "Outer2";
    void doStuff() {
        class MyInner {
            public void seeOuter() {
                System.out.println("Outer x is " + x);
            } // close inner class method
        } // close inner class definition
    } //
}
