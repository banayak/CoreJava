package com.java.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
	private final int empId;
	private final String name;
	private final List<String> list;

	ImmutableClass(int empId, String name, List<String> inList) {
		this.empId = empId;
		this.name = name;
		this.list = Collections.unmodifiableList(inList);
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ImmutableClass [empId=" + empId + ", name=" + name + ", list="
				+ list + "]";
	}

	public List<String> getList() {
		return list;
	}

}
