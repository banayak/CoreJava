package com.java.practice.collection;

public class Student implements Comparable{
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo+",firstName:"+firstname+",lastName:"+lastName+",Home address :"+homeAddress;
	}

	@Override
	public int compareTo(Object obj) {
		Student student1 = (Student) obj;
		int result =0;
			result = String.valueOf(this.getRollNo()).compareTo(String.valueOf(student1.getRollNo()));
		if(result == 0)
			result = this.getFirstname().compareTo(student1.getFirstname());
		if(result == 0)
			result = this.getLastName().compareTo(student1.getLastName());
		return result;
	}
	
	

}
