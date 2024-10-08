package com.java.practice.exception;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionExampleTryCatch {

	public static void main(String[] args) {
		int a = method();
		System.out.println("Print value of a :"+a);
	}
	
	static int method(){
		int x =15 , y=0;
		int z =0;
		try{
			z = x/y;
			System.out.println(z);
			System.out.println("end of program exceution");
		}
		catch (ArithmeticException  e){
			e.printStackTrace();
			System.err.println("Error occured : "+e.getMessage());
		}
		catch (Exception  e){
			e.printStackTrace();
			System.err.println("Error occured : "+e.getMessage());
		}
		
		return z;
	}

}
