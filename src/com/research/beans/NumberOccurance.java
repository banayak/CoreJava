package com.research.beans;

import java.util.Comparator;

public class NumberOccurance implements Comparable<NumberOccurance>,Comparator<NumberOccurance> {
	private int number;
	private int count;

	public NumberOccurance() {

	}

	public NumberOccurance(int cnt, int no) {
		this.count = cnt;
		this.number = no;
	}

	public NumberOccurance(int no) {
		this.number = no;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public boolean equals(Object o) {
		NumberOccurance obj = (NumberOccurance) o;
		return String.valueOf(number).equals(String.valueOf(obj.getNumber()));
	}

	@Override
	public int hashCode() {
		return 15 * number;
	}

	@Override
	public String toString() {
		return "Number =" + number+" , count ";
	}

	@Override
	public int compare(NumberOccurance object1, NumberOccurance object2) {
		if(object1.getNumber() > object2.getNumber())
			return 1;
		else if(object1.getNumber() < object2.getNumber())
			return -1;
		else
			return String.valueOf(object1.getCount()).compareTo(String.valueOf(object2.getCount()));
	}

	@Override
	public int compareTo(NumberOccurance o) {
		if(this.count > o.getCount())
			return -1;
		else if(this.count < o.getCount())
			return 1;
		return String.valueOf(number).compareTo(String.valueOf(o.getNumber()));
	}

}
