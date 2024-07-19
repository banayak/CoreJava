package com.java.practice.oops.concepts;

public class Flat {
	private int bedRoom;
	private int bathroom;
	
	public Flat(int bedRoom, int bathroom) {
		super();
		this.bedRoom = bedRoom;
		this.bathroom = bathroom;
	}

	public int getBedRoom() {
		return bedRoom;
	}

	public void setBedRoom(int bedRoom) {
		this.bedRoom = bedRoom;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}

	@Override
	public  String toString() {
		return "Flat [bedRoom=" + bedRoom + ", bathroom=" + bathroom + "]";
	}

	

	
}
