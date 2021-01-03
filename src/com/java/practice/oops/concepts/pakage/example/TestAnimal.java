package com.java.practice.oops.concepts.pakage.example;

import com.java.practice.oops.concepts.Animal;
import com.java.practice.oops.concepts.Cat;

public class TestAnimal {

	public TestAnimal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.showAnimalInformation();
		/*Animal obj1 = new Animal("Tiger",50); 
		obj1.showAnimalInformation();*/
		
		// Cat
		System.out.println("------Cat object infos-------");
		Cat catObj = new Cat();
		catObj.setAnimalAge(50);
		catObj.setAnimalName("Tiger");
		catObj.showAnimalInformation();
		catObj.setCatName("Pusshy");
		catObj.setCatAge(10); 
		catObj.showCatInformation();
		
		
		

	}

}
