package com.java.practice.oops.concepts.pakage.example;

import com.java.practice.oops.concepts.Animal;
import com.java.practice.oops.concepts.Cat;

public class TestAnimal {

	public TestAnimal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Animal animal = new Animal("Lion",75);
		animal.displayAnimalInfo();
		
		// Cat
		System.out.println("------Cat object infos-------");
		Cat cat = new Cat("Mioan",10);
		cat.displayAnimalInfo();

		//Overriding Concepts
		System.out.println("Overriding animal info");
		Animal animalObj = cat; // new Cat("Dummy",10);
		animalObj.displayAnimalInfo();

		/*Cat catObj = (Cat) new Animal("Tiger",75);
		catObj.displayAnimalInfo();*/
		

	}

}
