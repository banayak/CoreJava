package com.java.practice.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		//List iterator example
		 List <String> name = new ArrayList<>();  
	       name.add("Ravi");  
	       name.add("Tina");  
	       name.add("Payal");  
	       name.add("Aashi");  
	       System.out.println("The list of the names of the students is given as: "+name);  
	       System.out.println("Before using the set() method : ");
	       
	       ListIterator<String> iterator = name.listIterator();  
	       while (iterator.hasNext()) {  
	    	   String itrName = iterator.next();
	           System.out.println(itrName);
	       }  
	       while (iterator.hasPrevious()) {  
	           System.out.println("Prev node::"+iterator.previous());  
	       }  
	       iterator.set("None");  
	       System.out.println("After using the set() method : ");  
	       for (String item : name) {  
	           System.out.println(item);  
	       }  

	}

}
