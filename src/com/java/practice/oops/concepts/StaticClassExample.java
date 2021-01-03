package com.java.practice.oops.concepts;

public class StaticClassExample {
	
	 int x =10;
	 static int y = 20;
	 
	 static{
		 System.out.println(" inside static block..");
		 y=40;
	 }
	 
	

	public StaticClassExample() {
		super();
		System.out.println("inside StaticClassExample constructor..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(y);
		StaticClassExample classExample =  new StaticClassExample();
		System.out.println(classExample.x + ", y=: "+classExample.y);

	}
	
	static void method1(){
		System.out.println("hello I am here inside static method1");
	}

}
