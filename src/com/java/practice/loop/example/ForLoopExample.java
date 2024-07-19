package com.java.practice.loop.example;

public class ForLoopExample {

	public static void main(String[] args) {
		int j =5;
		int sum =0;
		for (int index=0; index <=5; index++){    
			sum = sum + index;
		}
		System.out.println(sum);
		
		int [] a = {1,2,3,4};
		/*for(int x = 0; x < a.length; x++) // basic for loop
		System.out.println(a[x]);*/
		for(int n : a) // enhanced for loop
		System.out.println(n);

	}
	

}
