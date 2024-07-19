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
		System.out.println("Cat Name: " + this.catName+"\nCat  Age: " + this.catAge);
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
