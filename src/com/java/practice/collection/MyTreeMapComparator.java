package com.java.practice.collection;

import java.util.Comparator;
import java.util.TreeMap;

import com.research.beans.Employee;

public class MyTreeMapComparator {

	public static void main(String a[]) {
		// the treemap sorts by key
		TreeMap<String, String> hm = new TreeMap<String, String>(new MyComp());
		// add key-value pair to TreeMap
		hm.put("java", "language");
		hm.put("computer", "machine");
		hm.put("india", "country");
		hm.put("mango", "fruit");
		System.out.println(hm);
		TreeMap<Employee, Integer> empTreeMap = new TreeMap<Employee, Integer>(
				new Employee());
		empTreeMap.put(new Employee(900,"Alok"), 900);
		empTreeMap.put(new Employee(200,"Ashok"), 200);
		empTreeMap.put(new Employee(200,"Basanta"), 200);
		empTreeMap.put(new Employee(100,"Alok"), 100);
		empTreeMap.put(new Employee(600,"Nuru"), 600);
		System.out.println("Sorted Employee Map ::"+empTreeMap); 
	}
}

class MyComp implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2);
	}
}