package com.java.practice.collection;

public class EqualExample {

	public static void main(String[] args) {
		int a =5;
		int b=5;
		// == only do swallow compasrision , we can do for primitive , string long 
		//it will do only reference value comparision not for deep comapriosn
		System.out.println("a equals b = "+ (a == b)); 
		
		String student1 = "Rama";
		String student2 = "Hari";
		String student3 = "Rama";
		
		System.out.println("student1 equals student2 = "+ (student1 == student2));
		System.out.println("student1 equals student3 = "+ (student1 == student3));
		System.out.println("student2 equals student3 = "+ (student2 == student3)); 
		
		//Comaprision with Object
	
		String student4 = new String("Rama");
		String student5 = new String("Hari");
		String student6 = new String("Rama");
		
		System.out.println("----------------Comaprision wilth Objects----------------");
		System.out.println("student4 equals student5 = "+ (student4 == student5));
		System.out.println("student4 equals student6 = "+ (student4 == student6));
		System.out.println("student5 equals student6 = "+ (student5 == student6)); 
		
		System.out.println("----------------deeper Comaprision wilth eqqual----------------");
		System.out.println("student4 equals student5 = "+ student4.equals(student5));
		System.out.println("student4 equals student6 = "+ student4.equals(student6));
		System.out.println("student5 equals student6 = "+ student5.equals(student6)); 
	}

}
