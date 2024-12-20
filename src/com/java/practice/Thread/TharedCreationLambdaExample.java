package com.java.practice.Thread;

public class TharedCreationLambdaExample {
    public static void main(String[] args) {

        // Creating Lambda expression for run() method in
        // functional interface "Runnable"
        Runnable myThread = () ->
        {

            // Used to set custom name to the current thread
            Thread.currentThread().setName("myThread");
            System.out.println(
                    Thread.currentThread().getName()
                            + " is running");
        };

        Thread run = new Thread(myThread);
        run.start();
    }

}
