package com.java.practice.oops.concepts;

public class Singleton {
	public static Singleton singleton = new Singleton();
	private double number;

	private Singleton(){
		number = Math.random();
		System.out.println("Object created ..");
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

}