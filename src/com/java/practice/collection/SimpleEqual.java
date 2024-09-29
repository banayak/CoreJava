package com.java.practice.collection;

public class SimpleEqual {
    public static void main(String[] args) {
        String empName1 = "Hari";
        String empName2 = "Hari";
        String empName3 = new String("Hari");
        String emp4 = empName1;
        System.out.println("empName1 is equal to empName2 :"+empName1.equals(empName2));
        System.out.println("empName1 is ==  to empName2 :"+ (empName1 == empName2));
        System.out.println("empName1 is equal to empName3 :"+empName1.equals(empName3));
        System.out.println("empName1 is ==  to emp4 :"+ (empName1 == emp4));

        Employee employee1 = new Employee(10,"Sanku");
        Employee employee2 = new Employee(10,"sanku");
        Employee employee3 = employee1;

        System.out.println("employee1 is equal to employee2 :"+ employee1.equals(employee2)); // .euaals  alwyas do deep comparison
        System.out.println("print employee1 hascode:"+ employee1.hashCode());
        System.out.println("employee1 == to employee2 :"+ (employee1 == employee2)); // Swallow comparison
        //After assigning employee3 with employee 1
        System.out.println("employee1 is equal to employee3 :"+ employee1.equals(employee3)); // .euaals  alwyas do deep comparison
        System.out.println("employee1 == to employee3 :"+ (employee1 == employee3)); // Swallow comparison
    }
}
