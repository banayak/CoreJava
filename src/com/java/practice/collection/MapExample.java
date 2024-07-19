package com.java.practice.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		//older way with out generics
		Map studentMap = new HashMap();
		studentMap.put("Bishu", "Bishwranjan Padhi");
		studentMap.put(101, "Bishwranjan Padhi");
		studentMap.put(101, "Padhi");
		studentMap.put(101, "Padhi");
		studentMap.put(null, "Padhi");
		studentMap.put(null, "Padhi 2");

		System.out.println("size of map :"+ studentMap.size());
		for(Object key : studentMap.keySet()){
			System.out.println("Key :"+key+ ", value :"+studentMap.get(key));
		}
		//with generics way
		Map<Integer,String> studentGenericsMap = new HashMap<Integer,String>();
		studentGenericsMap.put(101, "Bishwranjan Padhi");
		studentGenericsMap.put(102, "Bishwranjan Padhi");
		studentGenericsMap.put(1589, "Padhi");
		studentGenericsMap.put(101, "Padhi");
		studentGenericsMap.put(null, "Padhi");
		studentGenericsMap.put(null, "Padhi 2");
		
		System.out.println("-------------- size of map :"+ studentGenericsMap.size());
		for(Integer key : studentGenericsMap.keySet()){
			System.out.println("Key :"+key+ ", value :"+studentMap.get(key));
		}
		
		// Custom object to put key in Map
		Map<Employee,String> studentCustomKeyMap = new HashMap<>();
		
		Employee employee1 = new Employee(101, "Bishu");
		Employee employee2 = new Employee(105, "Rama");
		Employee employee3 = new Employee(101, "Bishu");
		
		studentCustomKeyMap.put(employee1, employee1.getFirstname());
		studentCustomKeyMap.put(employee2, employee2.getFirstname());
		studentCustomKeyMap.put(employee3, employee3.getFirstname());
		
		System.out.println("----Iterating over custom object as key in map");
		for(Employee key : studentCustomKeyMap.keySet()){
			System.out.println("Key :"+key+ ", value :"+studentCustomKeyMap.get(key));
		}
		
		System.out.println(studentCustomKeyMap.get(employee1));

	}

}
