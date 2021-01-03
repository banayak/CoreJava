package com.java.practice.loop.example;

public class doWhileExample {

	public static void main(String[] args) {
		int index =1;
		int sum = 0;
		do{
			sum =  sum + index;
			//index++;
		}while (index++ <= 5);
		System.out.println("Summation :"+sum);
			
	}

}
