package com.java.jsf;

import javax.faces.event.ActionEvent;

public class NameBean {

	private String firstName;
	private String lastName;
	private String fullName;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	
	public NameBean() {}
	public void result(ActionEvent evt) {
		this.fullName = this.firstName + " " +this.lastName;
	}
	
	
}
