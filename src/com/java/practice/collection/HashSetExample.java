package com.java.practice.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import com.research.beans.Employee;
import com.research.beans.Studentinfo;

public class HashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Studentinfo student = new Studentinfo(1, "Rama");
		Studentinfo student1 = new Studentinfo(1, "Rama");
		Set<Studentinfo> studentSet = new HashSet<Studentinfo>();
		studentSet.add(student);
		studentSet.add(student1);
		Studentinfo student3 = new Studentinfo(3, "Rama");
		System.out.println("Size of Studentinfo set ::"+studentSet.size());
		System.out.println(" Object present in student set ::"+studentSet.contains(student3));
		Iterator<Studentinfo> itr = studentSet.iterator();
		while (itr.hasNext()){
			System.out.println(" Value ::"+itr.next());
		}	

	}

}
