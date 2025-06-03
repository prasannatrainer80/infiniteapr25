package com.java.solid;

public class FullTimeEmploy implements IEmployDetail {

	@Override
	public void name() {
		System.out.println("Name is Ram...");
	}

	@Override
	public void paymentDetails() {
		System.out.println("You can get payment in month end...Last working Day");
	}

	@Override
	public void pfDetails() {
		System.out.println("Your Details shared to Accounts Deparment");
	}

	@Override
	public void paySlips() {
		System.out.println("Payslip genetated by 10th of every month");
	}

}
