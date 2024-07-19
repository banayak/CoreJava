package com.java.practice.collection;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,String> myMap = new HashMap<Integer, String>();
		for(int i=1; i< 10 ; i++)
			myMap.put(i, "Test"+i);
		for(Map.Entry<Integer, String> entry : myMap.entrySet()){
			int key = entry.getKey();
			if(key ==5){
				myMap.put(5, "Hi");
				myMap.remove(1);
			}
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

}
