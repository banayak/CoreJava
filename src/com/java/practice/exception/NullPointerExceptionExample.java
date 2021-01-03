package com.java.practice.exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String name = null;
		printName(name);
	}
	static void printName(String name){
		System.out.println("Print name :"+ name);
		System.out.println(name.charAt(0));
	}
}
