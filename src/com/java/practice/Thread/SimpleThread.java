package com.java.practice.Thread;

public class SimpleThread extends Thread{

    public SimpleThread(String name){
        Thread.currentThread().setName(name);
    }

    @Override
    public void run(){
        setName("Sanku");
        System.out.println("Current Thread "+Thread.currentThread().getName()+ " started running");
    }

}
