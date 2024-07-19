package com.java.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import com.research.beans.Employee;

public class HashMapHashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>(); 
		concurrentHashMap.put(null,"abc");
		HashMap<Employee,String> myMap = new HashMap<Employee,String>();
		Employee employee = new Employee(1, "Basanta");
		Employee e1 = new Employee(1, "Basanta");
		myMap.put(employee, employee.getName());
		System.out.println("containks Key ::"+myMap.containsKey(e1)+" Value="+myMap.get(e1));
		System.out.println("Comparing two object by commented hashcode ::"+employee.equals(e1));
		Employee e2 =  new  Employee(2059,"Rama");
		Employee e3 =  new  Employee(2023,"Hari");
		Employee e4 =  new  Employee(1053,"Shyam");
		HashMap<Employee, Employee> map = new HashMap<Employee,Employee>();
		map.put(e2, e2);
		map.put(e3, e3);
		map.put(e4, e4);
		for(Entry<Employee, Employee> entry : map.entrySet()){
			System.out.println("Emp Id:"+entry.getKey().getEmpId()+", Name ::"+entry.getValue());
		}
		System.out.println("After Sorting......");
		TreeMap<Employee, Employee> sorteMap = new  TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpId().compareTo(o2.getEmpId());
			}
		});
		sorteMap.putAll(map);
		
		for(Entry<Employee, Employee> entry : sorteMap.entrySet()){
			System.out.println("Emp Id:"+entry.getKey().getEmpId()+", Name ::"+entry.getValue());
		}

	}

}
