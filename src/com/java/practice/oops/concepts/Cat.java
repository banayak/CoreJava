package com.java.practice.oops.concepts;

public class Cat extends Animal {
	private String catName;
	private int catAge;

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
	

	public void showCatInformation() {
		System.out.println("Animal Name :" + animalName + " ,age : "
				+ animalAge);
		System.out.println("Cat Name :" + catName + " , Cat age : " + catAge);

	}

	public void eat(String s) {
		super.eat();
		System.out.println("Horse eating hay, oats, " + "and horse treats"+animalName);
	}

}
