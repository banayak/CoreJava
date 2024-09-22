package com.java.practice.strings;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Hari";  // It will create object in string pool , only One object will be created
        String s2 =  new String("Rama"); // 2 object will be created on is String pool and another in heap
        s1 = "Rama and Hari"; //create another object in string pool
        String s3 = s1+ " Haru"; // create 3 objects in memory pool

        System.out.println( s1 + System.lineSeparator()+s2+ System.lineSeparator()+ s3);
    }
}
