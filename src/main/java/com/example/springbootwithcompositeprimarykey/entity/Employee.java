package com.example.springbootwithcompositeprimarykey.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@EmbeddedId
	private EmployeePKId employeePKId;
	private String name;
	private String phone;
	private String email;

	public Employee() {

	}

	public Employee(EmployeePKId employeePKId, String name, String phone, String email) {
		super();
		this.employeePKId = employeePKId;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public EmployeePKId getEmployeePKId() {
		return employeePKId;
	}

	public void setEmployeePKId(EmployeePKId employeePKId) {
		this.employeePKId = employeePKId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
