package com.research.beans;

import java.io.Serializable;

public class Studentinfo implements Serializable {
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int rid;
	private String contact;
	private String address;

	public Studentinfo(String n, int r, String c) {
		this.name = n;
		this.rid = r;
		this.contact = c;
	}
	public Studentinfo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Studentinfo [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studentinfo other = (Studentinfo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
