package com.java.practice.oops.concepts;

public class Animal {
	 String animalName;
	 int animalAge ;

	public Animal(String name, int age){
		this(name,age,"black");
	}

	public Animal(String name, int age,String color){
		super();
		this.animalName = name;
		this.animalAge = age;
	}

	public Animal(){
		super();
		//this("test",8);
	}
	
	protected void displayAnimalInfo(){
		System.out.println("Animal Name: " + this.animalName+" , Animal Age: " + this.animalAge);
	}

	//Covariant Return Type
	public Animal displayAnimalDetails(){
		System.out.println("Animal Name: " + this.animalName+" , Animal Age: " + this.animalAge);
		return new Animal("Leo",89);
	}

	 public void displayAnimalInfo(String name, int age){
		System.out.println("Overloaded Animal details , Name: " + name+"\nAnimal Age: " + age);
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}
}
