package com.java.practice.oops.concepts.pakage.example;

import com.java.practice.oops.concepts.Animal;
import com.java.practice.oops.concepts.Cat;

public class TestOverriding {

	public static void main(String[] args) {
		Animal animalObj = new Animal();
		animalObj.setAnimalName("Tiger");
		animalObj.eat();
		Cat catObj = new Cat();
		catObj.setAnimalName("Tiger");
		catObj.eat("Hello");
		
		
		//Overriding polymorphisim
		Animal obj2 = new Cat();
		obj2.eat();
		
		// Cat obj3 =  new Animal(); will not take
	}

}
