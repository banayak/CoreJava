package com.java.practice.oops.concepts;

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
		Animal animalObj = new Cat("Pussy",2); // new Cat("Dummy",10);
		animalObj.displayAnimalInfo();

		/*Cat catObj = (Cat) new Animal("Tiger",75);
		catObj.displayAnimalInfo();*/

		//Overloaded method
		Animal animal1 = new Animal();
		animal1.displayAnimalInfo();
		animal1.displayAnimalInfo("Tiger",20);

		Cat  cat1 =  new Cat("Bili",3);
		cat1.displayAnimalInfo("Bear",50);

		Animal animal2 = new Cat("Bili Mioa",15);
		System.out.println("Test Overriding Method");
		animal2.displayAnimalInfo();
		System.out.println("Test Overloading Method");
		animal2.displayAnimalInfo("Test Billi",9);

		//Covariant Return Type Test
		System.out.println("Testing Covariant Retur type..");
		Animal animal3 = new Animal("Leopard", 40);
		animal3.displayAnimalInfo();
		animal3 = animal3.displayAnimalDetails();
		animal3.displayAnimalInfo();

		Animal animal4 = new Cat("White Cat",7);
		animal4.displayAnimalInfo();
		animal4 = animal4.displayAnimalDetails();
		animal4.displayAnimalInfo();
		

	}

}
