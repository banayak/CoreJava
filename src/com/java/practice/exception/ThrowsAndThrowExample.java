package com.java.practice.exception;

public class ThrowsAndThrowExample {

	public static void main(String[] args)  {
		
			try {
				int x=  method();
				int b=  method1();
			}
			 catch (NullPointerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		//Statments
		
	}
	
	static int method() throws Exception{
		int x =15 , y=0, z=0;
		
			try {
				z =x/y;
			} catch (Exception ex) {
				// TODO Auto-generated catch block
				//throw ex;
				ex.printStackTrace();
				throw new NullPointerException();
			}
		
		return z;
	}
	
	static int method1() throws CustomException{
		int x =15 , y=0;
		
		if(y == 0){			
			throw new CustomException("Exception occured.");
			
		}		
		int z =x/y;
		return z;
	}
}
