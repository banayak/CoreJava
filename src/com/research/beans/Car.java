package com.research.beans;

public class Car implements Comparable<Car> {

	int weight;
	String name;

	public Car(int w, String n) {
		weight = w;
		name = n;
	}

	public boolean equals(Object o) {
		if (o instanceof Car) {
			Car d = (Car) o;
			return ((d.name.equals(name)) && (d.weight == weight));
		}
		return false;

	}

	public int hashCode() {
		return weight / 2 + 17;
	}

	public String toString() {
		return "I am " + name + " !!!";
	}

	public int compareTo(Car d) {
		if (this.weight > d.weight)
			return 1;
		else if (this.weight < d.weight)
			return -1;
		else
			return 0;
			//return name.compareTo(d.name);
	}

	/*
	 * public int compareTo(Car d){ return this.name.compareTo(d.name); }
	 */

}