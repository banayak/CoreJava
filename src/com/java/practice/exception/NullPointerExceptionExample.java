package com.java.practice.exception;

import com.research.beans.Employee;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		Employee employee = new Employee(100,"Sankuru");
		System.out.println("Print employe details ::"+ employee.getName()+ " ,id :"+employee.getEmpId());
		employee = null;
		System.out.println(" After employee object assigned as null , Print employe details::"+ employee.getName()+ " ,id :"+employee.getEmpId());
	}

}
