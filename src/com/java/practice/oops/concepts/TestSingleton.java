package com.java.practice.oops.concepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {

	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service...");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        
        Runnable task1 = () -> {
            System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
            Singleton singleton = Singleton.singleton;
            System.out.println(singleton.getNumber());
        };
        
        Runnable task2 = () -> {
            System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
            Singleton obj2 = Singleton.singleton;
            System.out.println(obj2.getNumber());
        };
       
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.shutdown();

	}

}
