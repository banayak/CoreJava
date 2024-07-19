package com.java.practice.oops.concepts;

public class Animal {
	 String animalName;
	 int animalAge ;

	public Animal(String name, int age){
		this.animalName = name;
		this.animalAge = age;
	}
	
	public void displayAnimalInfo(){
		System.out.println("Animal Name: " + this.animalName+"\nAnimal Age: " + this.animalAge);
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
