package com.java.practice.Thread;

public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
       // System.out.println(Thread.currentThread().getName() + " Thread is created and running ..");

        for (int x = 1; x <= 400; x++) {
            if(x == 15){
                try {
                    System.out.println(Thread.currentThread().getName() +" going to sleep for 10 sec..");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", x is " + x);
        }

    }
}
