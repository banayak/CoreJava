package com.java.practice.oops.concepts;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("Bishu", 25);
		//student.setAge(25);
		student.setName("Rama");		
		System.out.println("Student name :"+student.getName()+" , age :"+student.getAge());

	}

}
