package com.java.practice.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceutorThreadExample {

    public static void main(String[] args) {
        ExecutorService executorService =   Executors.newFixedThreadPool(5);
        //Submit Task to the executor

        for (int i=0; i < 5; i++){
            Runnable task = ()-> {
                System.out.println(" Task executed by Thread :"+ Thread.currentThread().getName());
            };
            executorService.submit(task);
        }

    }
}
