package com.java.practice.Thread;

import java.util.List;

public class Line {
    // if multiple threads(trains) trying to access
    // this synchronized method on the same Object
    // but only one thread will be able
    // to execute it at a time.
    synchronized public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            String name = Thread.currentThread().getName();
            System.out.println(name + " Line acquire :"+i);
            try
            {
                System.out.println("Thread Name :"+ name +" going for sleep for 10 sec, lock will not be released ");
                Thread.sleep(1000*100);
                System.out.println("Thread Name :"+ name +" wake up");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

     public void getLineSynBlock(List<Integer> accounts) throws InterruptedException {
        for (int i = 0; i < 3; i++)
        {
            String name = Thread.currentThread().getName();
            System.out.println("Thread Name "+name + " before adding accounts :"+ accounts);

           synchronized (accounts){
               // This portion will be locked
               for (int j=101; j < 500 ; j++){
                   accounts.add(j);
                   //System.out.println(name +" account "+ j +" added");
                   //Thread.sleep(10000);
               }
           }
            System.out.println("Thread Name "+name + " after  adding whole accounts :"+ accounts);

        }
    }

     public void getLineWithoutSynchronization()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(Thread.currentThread().getName() + " Line acquire :"+i);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
