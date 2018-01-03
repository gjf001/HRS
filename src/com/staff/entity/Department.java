package com.staff.entity;

import java.util.Set;

public class Department {
	private int d_id;
	private String d_name;
	private Set<Staff> staff;

	public Department() {
	}

	public Department(int d_id, String d_name) {
		this.d_id = d_id;
		this.d_name = d_name;
	}

	public Set<Staff> getStaff() {
		return staff;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_name() {
		return d_name;
	}
}
