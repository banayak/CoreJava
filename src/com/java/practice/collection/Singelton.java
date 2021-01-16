package com.java.practice.collection;

public class Singelton {
	private static  Singelton SINGELTON;
	
	private Singelton(){
	}
	static{
		SINGELTON = new Singelton();
	}

}
