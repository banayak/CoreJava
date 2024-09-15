package com.java.practice.exception;

public class ThrowsAndThrowExample {

    public static void main(String[] args) throws CustomException {

        try {
            System.out.println("swallow the exception inside method 1");
            int x = method();
            System.out.println("Print value of x::" + x);
            System.out.println("Custom exception thrown by method with try catch example");
            int b = method1();
            System.out.println(" Will it print after exception");
        } catch (NullPointerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            System.out.println(" Here I am ");
        }
        System.out.println("Custom exception thrown by method with throws method level");
        methodThrowsExample();


        //Statments

    }

    static int method() throws Exception {
        int x = 15, y = 0, z = 0;

        try {
            z = x / y;

        } catch (Exception ex) {
            ex.printStackTrace();
            //throw ex;
        }
        z = x * 8;

        return z;
    }

    static int method1() throws CustomException {
        int x = 15, y = 0;

        if (y == 0) {
            throw new CustomException("Exception occured.",new ArithmeticException());

        }
        int z = x / y;
        return z;
    }

    static int methodThrowsExample() throws CustomException {
        int x = 15, y = 0;
        int z = x / y;
        return z;
    }
}
