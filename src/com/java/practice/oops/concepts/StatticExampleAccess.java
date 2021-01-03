package com.java.practice.oops.concepts;

public class StatticExampleAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Y :"+StaticClassExample.y);
		StaticClassExample.method1();
		StaticClassExample.y = 30;
		System.out.println("Print Y :"+StaticClassExample.y);
		

	}

}
