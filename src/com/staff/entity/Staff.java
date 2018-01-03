package com.staff.entity;

import java.util.Set;

import com.customer.entity.Customer;

public class Staff {
	private int s_id;
	private String s_name;
	private int s_age;
	private String s_address;
	private String s_email;
	private String s_mobile;
	private int d_id;
	private int s_statement;
	private Set<Customer> customer;

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	public Staff() {
	}

	public Staff(int s_id, String s_name, int s_age, String s_address,
			String s_email, String s_mobile, int d_id, int s_statement) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_age = s_age;
		this.s_address = s_address;
		this.s_email = s_email;
		this.s_mobile = s_mobile;
		this.d_id = d_id;
		this.s_statement = s_statement;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

	public int getS_age() {
		return s_age;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	public String getS_email() {
		return s_email;
	}

	public void setS_mobile(String s_mobile) {
		this.s_mobile = s_mobile;
	}

	public String getS_mobile() {
		return s_mobile;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public int getD_id() {
		return d_id;
	}

	public void setS_statement(int s_statement) {
		this.s_statement = s_statement;
	}

	public int getS_statement() {
		return s_statement;
	}
}
