package com.java.solid.isp;

public class Sourav implements IEmployDetails, IAccountDetails {

	@Override
	public void pfDetails() {
		System.out.println("Pf Details to be shared and check online");
	}

	@Override
	public void paySlips() {
		System.out.println("Payslips to Be generated automatically get by mail...");
	}

	@Override
	public void name() {
		System.out.println("Name is Sourav Das...");
	}

	@Override
	public void paymentDetails() {
		System.out.println("Payment to be Credited to your salary account");
	}

}
