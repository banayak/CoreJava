package com.java.practice.oops.concepts;

public class Cat extends Animal {
	private String catName;
	private int catAge;

	public Cat(String name, int age) {
		super(name, age);
		this.catName = name;
		this.catAge = age;
	}

	public void displayAnimalInfo(){
		System.out.println("Cat Name: " + this.catName+" , Cat  Age: " + this.catAge);
		System.out.println("Animal Info : Animal Name :" +animalName +" , Animal Age :" +animalAge);
	}

	//Covariant Return Type
	public Cat displayAnimalDetails(){
		System.out.println("Cat Name: " + this.animalName+" , Cat Age: " + this.animalAge);
		return new Cat("Leo",89);
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatAge() {
		return catAge;
	}

	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
}
