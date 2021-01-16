package com.java.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class TestImmutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Basanta");
		ImmutableClass immutableEmployee = new ImmutableClass(1, "Hari",list);
		System.out.println("Before modifying immutable class::"+immutableEmployee.toString());
		immutableEmployee.getList().add("Nayak");
		System.out.println("After modifying immutable class::"+immutableEmployee.toString());
	}

}
