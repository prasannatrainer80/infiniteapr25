package com.java.solid;

public class ContractEmploy implements IEmployDetail {

	@Override
	public void name() {
		System.out.println("Hi I am Swapna...");
	}

	@Override
	public void paymentDetails() {
		System.out.println("You will get after deducting TDS...");
	}

	@Override
	public void pfDetails() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void paySlips() {
		throw new UnsupportedOperationException();
	}
	
}
