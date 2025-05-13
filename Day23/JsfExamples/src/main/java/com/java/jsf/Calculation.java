package com.java.jsf;

import javax.faces.event.ActionEvent;

public class Calculation {

	private int firstNo;
	private int secondNo;
	private int result;
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getSecondNo() {
		return secondNo;
	}
	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public void addition(ActionEvent evt) {
		this.result = this.firstNo + this.secondNo;
	}
}
