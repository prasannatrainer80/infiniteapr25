package com.java.solid.isp;

public class IspSolution {
	public static void main(String[] args) {
		Sourav objSourav = new Sourav();
		objSourav.name();
		objSourav.paymentDetails();
		objSourav.pfDetails();
		objSourav.paySlips();
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");
		
		Induja objInduja = new Induja();
		objInduja.name();
		objInduja.paymentDetails();
	}
}
