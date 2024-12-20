package com.java.practice.innerclass;

public class OuterClassExample {
    public static void main(String[] args) {
        Outerclass  outerclass =  new Outerclass();
        Outerclass.innerClass inner =outerclass.new innerClass();
        System.out.println(inner.x);
    }
}
