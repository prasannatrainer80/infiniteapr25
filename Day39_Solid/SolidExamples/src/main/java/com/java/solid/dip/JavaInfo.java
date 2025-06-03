package com.java.solid.dip;

public class JavaInfo implements ITrainerData {

	@Override
	public void name() {
		System.out.println("Name is Prasanna...");
	}

	@Override
	public void city() {
		System.out.println("City From Hyderabad...");
	}

	@Override
	public void email() {
		System.out.println("Email is prasanna@gmail.com");
	}

}
