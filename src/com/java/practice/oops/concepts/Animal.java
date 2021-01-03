package com.java.practice.oops.concepts;

public class Animal {
	 String animalName;
	 int animalAge ;
	
	 public String getAnimalName() {
		return animalName;
	}
	 
	
	public Animal() {
		super();		
	}


	public Animal(String name, int age){
		this.animalName = name;
		this.animalAge = age;
	}
	
	 public  void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
	
	public void showAnimalInformation(){
		System.out.println("Name :"+animalName+" ,age : "+animalAge);
	}


	public int getAnimalAge() {
		return animalAge;
	}


	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}


	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	

}
