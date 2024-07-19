package com.java.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stuff = new ArrayList<String>(); // #1
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		Collections.sort(stuff); // #2
		System.out.println("sorted " + stuff);
		
		//Sorted Comaprsion with objects
		List<Student> students = new ArrayList<Student>();
		
		Student student1 =  new Student(101, "Tata", "Padhi", "Soro");
		Student student2 =  new Student(425, "Rama", "Padhi", "CTC");
		Student student3 =  new Student(103, "Dama", "Ratan", "Soro");
		Student student4 =  new Student(101, "Bishu", "Padhi", "BBSR");
		Student student5 =  new Student(101, "Bishu", "Padhi", "Soro");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		System.out.println("Before sorting students ::"+ students);
		//Collections.sort(students,new MyCompartor1());
		//Collections.sort(students);
		//Collections.sort(students,new MyCompartor1().thenComparing(new MyCompartor2()));
		//Sorting with Anonymous class with compartor
		
		Collections.sort(students, new Comparator<Student>(){
			@Override
			public int compare(Student student1, Student student2) {
				int result =0;
				result = String.valueOf(student1.getRollNo()).compareTo(String.valueOf(student2.getRollNo()));
				if(result == 0)
					result = student1.getFirstname().compareTo(student2.getFirstname());
				if(result == 0)
					result = student1.getLastName().compareTo(student2.getLastName());
				return result;
			}
		});
		
		System.out.println("After Sorting students ::"+ students);
		

	}

}

class MyCompartor1 implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		int result =0;
		result = String.valueOf(student1.getRollNo()).compareTo(String.valueOf(student2.getRollNo()));
		if(result == 0)
			result = student1.getFirstname().compareTo(student2.getFirstname());
		if(result == 0)
			result = student1.getLastName().compareTo(student2.getLastName());
		return result;
	}
}

class MyCompartor2 implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
	return  student1.getHomeAddress().compareTo(student2.getHomeAddress());
	}
}
