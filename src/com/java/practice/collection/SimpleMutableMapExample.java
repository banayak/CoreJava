package com.java.practice.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimpleMutableMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> mymap = new HashMap<Integer,String>();
		mymap.put(1, "Ram");
		mymap.put(2, "Hari"); 
		mymap.put(3, "Gopal");
		//Example using Collections.unmodifiableMap
		System.out.println("**********Simple Example using collection to prevent map from modify********** ");
		System.out.println("Before updating :: "+ mymap);
		mymap =  Collections.unmodifiableMap(mymap);
		mymap.put(4, "Gauri");
		System.out.println("After updating :: "+ mymap);
	}

}
