package com.java.practice.innerclass;

import com.java.practice.Thread.SimpleThread;

import static com.java.practice.innerclass.Outerclass.innerClass.x;

public class AnonymousDemo {
    public static void main(String[] args) {
        Age ageImpl = new Age() {
            @Override
            public void getAge() {
                System.out.println(" Inside Annonymous ::  x ="+age);
            }
        };
        ageImpl.getAge();

        //Thread annonymous Demo example
        Thread t =  new Thread(){
            @Override
            public void run(){
                System.out.println("Current Thread "+Thread.currentThread().getName()+ " started running");
            }
        };
        t.start();

        //Thread Runnable annonymous Demo example
        Runnable  runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread "+ Thread.currentThread().getName()+ " i ="+i);

                }
            }
        };
        Thread  t1 =  new Thread(runnable,"Sanku");
        t1.start();

    }
}
