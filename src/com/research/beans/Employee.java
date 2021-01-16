package com.research.beans;

import java.util.Comparator;

public class Employee implements Comparator<Employee>, Cloneable {
	private Integer empId;
	private String name;

	public Employee() {

	}

	public Employee(Integer id, String name) {
		this.empId = id;
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Employee){
			Employee e = (Employee)o;
			if(this.empId == e.getEmpId())
				return this.name.equals(e.getName());
			else
				return (this.empId == e.getEmpId());
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Name :" + this.name + ", ID:"+empId;
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getEmpId() > emp2.getEmpId())
			return 1;
		else if (emp2.getEmpId() > emp1.getEmpId())
			return -1;
		else
			return emp1.getName().compareTo(emp2.getName());
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
