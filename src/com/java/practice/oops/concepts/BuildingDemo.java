package com.java.practice.oops.concepts;

public class BuildingDemo {

	public static void main(String[] args) {
		Flat flat = new Flat(2, 2);
		Building building =  new Building(flat,8,"Green");
		building.showBuildingInfo();

	}

}
