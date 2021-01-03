package com.java.practice.loop.example;

public class IfElseIfExample {

	public static void main(String[] args) {
		int number = 5;
		//PrintIfElseIfStatement(number);
		PrintIfWithoutElseIfStatement(number);

	}
	
	static void PrintIfElseIfStatement(int no){
		int tobePaid= 0;
		if(no == 5){
			System.out.println( "Number :"+no*2);
			tobePaid = no*2;
		}
		else if(no == 6){
			System.out.println( "Number :"+no*4);
		}
		else if(no == 5){
			System.out.println( "Number :"+no*3);
		}
		else if(no == 5){
			System.out.println( "Number :"+no*5);
		}
		else{
			System.out.println("Show original number :"+no);
		}
		
	}
	
	static void PrintIfWithoutElseIfStatement(int no){
		if(no == 5){
			System.out.println( "Number :"+no*2);
		}
		if(no == 6){
			System.out.println( "Number :"+no*4);
		}
		if(no == 5){
			System.out.println( "Number :"+no*3);
		}
		if(no == 5){
			System.out.println( "Number :"+no*5);
		}
		else{
			System.out.println("Show original number :"+no);
		}
		
	}

}
