package com.java.practice.oops.concepts;

public class JavaMethodExample extends Object {
	
	public  JavaMethodExample(){
		super();
	}

	public int summation(int x , int y){		
		int z = x+y;
		System.out.println("Sum :"+z);
		return z;
	}
	
	public int summation(int x){			
		System.out.println("Sum :"+x);
		return x;
	}
	

}
