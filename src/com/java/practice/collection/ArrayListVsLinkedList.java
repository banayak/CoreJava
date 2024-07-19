package com.java.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		List<Integer> rollNosArrayList = new ArrayList<Integer>();
		rollNosArrayList.add(50);
		rollNosArrayList.add(100);
		rollNosArrayList.add(10);
		rollNosArrayList.add(5);
		System.out.println(rollNosArrayList); 
		
		ListIterator<Integer> rolls = rollNosArrayList.listIterator();
		while(rolls.hasNext()){
			System.out.println("Next value :"+rolls.next());
			if(rolls.next() == 10)
				System.out.println("Prev value :"+rolls.previous());
			//Test Commit diff to check again new commit
			
			
		}
	}

}
