package com.java.practice.Thread;

public class ThreadExample {

    public static void main(String[] args) {
        // Thread creation by extends Thread
        Thread t1 =  new SimpleThread("T1");
        t1.run();

        Thread t2 =  new SimpleThread("Sankru");
        t2.run();

        //Creating Thread Using Runnable Interface
        Runnable runnable = new ThreadRunnable();
        Thread t4= new Thread(runnable,"Hari");
        //t4.setPriority(10);
        t4.start();

        Thread t5= new Thread(runnable,"Rama");
        t5.start();


    }
}
