package com.java.practice.collection;

public class Employee {
	private final int employeeNumber;
	private final String firstname;

	public Employee(int employeeNumber, String firstname) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstname = firstname;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getFirstname() {
		return firstname;
	}



	// Overriding the hashcode() function 
    @Override
    public int hashCode() 
    { 

        // uses roll no to verify the uniqueness 
        // of the object of Student class 

        final int temp = 14; 
      /*  int ans = 1;
        ans = temp * ans + employeeNumber; 
        return ans; */
        return employeeNumber;
    } 

    // Equal objects must produce the same 
    // hash code as long as they are equal 
    @Override
    public boolean equals(Object object)
    { 
        if (this == object) {
            return true; 
        } 
        if (object == null) {
            return false; 
        } 
        if (this.getClass() != object.getClass()) {
            return false; 
        } 
        Employee other = (Employee)object;
        if (this.employeeNumber == other.employeeNumber && this.firstname.equalsIgnoreCase(other.firstname)) {
            return true;
        } 
        return false;
    } 

}
