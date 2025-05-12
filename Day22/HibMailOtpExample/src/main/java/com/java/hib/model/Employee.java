package com.java.hib.model;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	private String userName;
	private String passCode;
	private String email;
	private String status;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassCode() {
		return passCode;
	}
	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Employee() {

	}
	public Employee(int empId, String firstName, String lastName, String userName, String passCode, String email,
			String status) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passCode = passCode;
		this.email = email;
		this.status = status;
	}
	
	
}
