package com.java.practice.innerclass;

public class AgeImplemetaion implements Age{

    @Override
    public void getAge() {
        System.out.println("Print age "+ age);
    }

    public static void main(String[] args) {
        Age ageImplemetaion =  new AgeImplemetaion();
        ageImplemetaion.getAge();
    }
}
