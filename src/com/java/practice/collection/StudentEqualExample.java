package com.java.practice.collection;

public class StudentEqualExample {

	public static void main(String[] args) {
		Student student1 = new Student(101, "Bishu",	 "Padhi", "Soro");
		Student student2 = new Student(101, "Rama",	 "Padhi", "Soro");
		Student student3 = new Student(101, "Bishu",	 "Padhi", "Balasore");
		//swallow comparision 
		System.out.println("----------------- == comparision----------------");
		System.out.println("student1 == student2 "+ (student1 == student2));
		System.out.println("student1 == student3 "+ (student1 == student3));
		System.out.println("student2 == student3 "+ (student2 == student3));
		
		System.out.println("----------------- equal comparision----------------");
		System.out.println("student1 equals student2 "+ (student1.equals(student2)));
		System.out.println("student1 equals student3 "+ (student1.equals(student3)));
		System.out.println("student2 equals  student3 "+ (student2.equals(student3)));		
		
		//Print hashcode
		System.out.println(student1.hashCode());
	}

}
