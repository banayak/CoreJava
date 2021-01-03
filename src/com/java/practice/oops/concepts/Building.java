package com.java.practice.oops.concepts;

public class Building {
	private Flat flat; // comoposition	
	private int noOfFloors;
	private String color;
	
	
	public Building(Flat flat, int noOfFloors, String color) {
		super();
		this.flat = flat;
		this.noOfFloors = noOfFloors;
		this.color = color;
	}

	public Flat getFlat() {
		return flat;
	}

	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showBuildingInfo(){
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Building [flat=" + flat + ", noOfFloors=" + noOfFloors
				+ ", color=" + color + "]";
	}
	
}
