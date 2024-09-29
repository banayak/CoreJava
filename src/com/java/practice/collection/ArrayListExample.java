package com.java.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//Prmitive data type 
		int a=15;
		float b =67.0f;
		//Wrapper Object
		//Integer, Double,Float, Long, Decimal, BigDecimal
		Integer rol = Integer.valueOf(10);
		//without generics , we can add other data type number
		
		List  studentRollNos = new ArrayList();
		studentRollNos.add(10);
		studentRollNos.add(50.5);
		studentRollNos.add("Bishu");
		System.out.println(studentRollNos);
		
		/*for( Object rollNo : studentRollNos){
			int rollnumber = Integer.parseInt(rollNo.toString());
			System.out.println(rollnumber);
		}*/
		
		//Generics 
		//ArrayList<Integer> studentRollNosGenerics = new ArrayList<Integer>(100); 
		//Better way to declare
		List<Integer> studentRollNosGenerics = new ArrayList<Integer>(100); 
		studentRollNosGenerics.add(10);
		
		for( Integer rollNo : studentRollNosGenerics){
			int rollnumber = rollNo * 100/3;
			System.out.println(rollnumber);
		}
		System.out.println(studentRollNosGenerics.size());

	}

}
