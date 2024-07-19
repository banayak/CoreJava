package com.java.practice.collection;

public class Employee {
	private int employeeNumber;
	private String firstname;
	
	
	public Employee(int employeeNumber, String firstname) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstname = firstname;
	}


	public int getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	// Overriding the hashcode() function 
    @Override
    public int hashCode() 
    { 

        // uses roll no to verify the uniqueness 
        // of the object of Student class 

        final int temp = 14; 
        int ans = 1; 
        ans = temp * ans + employeeNumber; 
        return ans; 
    } 

    // Equal objects must produce the same 
    // hash code as long as they are equal 
    @Override
    public boolean equals(Object o) 
    { 
        if (this == o) { 
            return true; 
        } 
        if (o == null) { 
            return false; 
        } 
        if (this.getClass() != o.getClass()) { 
            return false; 
        } 
        Employee other = (Employee)o; 
        if (this.employeeNumber != other.employeeNumber) { 
            return false; 
        } 
        return true; 
    } 

}
