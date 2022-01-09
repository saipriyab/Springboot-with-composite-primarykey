package com.example.springbootwithcompositeprimarykey.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeePKId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private int deptId;
	public EmployeePKId()
	{
		
	}
	public EmployeePKId(int employeeId, int deptId) {
		super();
		this.employeeId = employeeId;
		this.deptId = deptId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
