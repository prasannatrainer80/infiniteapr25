package com.java.solid.isp;

public class Induja implements IEmployDetails {

	@Override
	public void name() {
		System.out.println("Name is Induja...");
	}

	@Override
	public void paymentDetails() {
		System.out.println("Payment You get every month last working day...");
	}

}
