package com.java.practice.Thread;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedExample {
    public static void main(String[] args) {

        Line obj = new Line();

        // we are creating two threads which share
        // same Object.
        List<Integer> mylist = new ArrayList<>();
        mylist.add(100);

        List<Integer> mylist1 = new ArrayList<>();
        mylist1.add(500);
        Train train1 = new Train(obj,"Number 1",mylist);
        Train train2 = new Train(obj,"Number 2",mylist1);

        // both threads start executing .
        train1.start();
        train2.start();

        Train train3 = new Train(obj,"Number 3");
        Train train4 = new Train(obj ,"Number 4");

        // both threads start executing .
        train3.start();
        train4.start();

    }
}
