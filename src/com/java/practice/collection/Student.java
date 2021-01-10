package com.java.practice.collection;

public class Student {
	private int rollNo;
	private String firstname;
	private String lastName;
	private String homeAddress;

	public Student(int rollNo, String firstname, String lastName,
			String homeAddress) {
		super();
		this.rollNo = rollNo;
		this.firstname = firstname;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public boolean equals(Object obj) {
		//Preventing check using instanceof
		if(obj instanceof Student){
			Student student = (Student) obj;
			if (this.rollNo == student.getRollNo()
					&& this.firstname.equals(student.getFirstname())
					&& this.lastName.equals(student.getLastName())) {
				return true;
			}
		}
		
		
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode()* rollNo+67;
	}
	
	

}
