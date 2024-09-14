package com.java.practice.exception;

public class ArrayIndexOfBoundExceptionExample {

    public static void main(String[] args) {
        int[] rollNumber = {101, 102, 526, 895};
        System.out.println("rollNumber array size :" + rollNumber.length + " rollNumber of position value of 2 : " + rollNumber[2]);

        try {
            System.out.println("rollNumber of position value of 5 : " + rollNumber[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {            System.out.println("Inside ArrayIndexOutOfBoundsException ");

            throw new RuntimeException(e);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
