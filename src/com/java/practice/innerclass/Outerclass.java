package com.java.practice.innerclass;

public class Outerclass {
    private int id;

     class innerClass{
        protected static int x= 10;
    }

    public void getDetails(){
        Outerclass.innerClass innerClass  = new innerClass();
        System.out.println("Print inner class :"+ innerClass.x);
    }
}
