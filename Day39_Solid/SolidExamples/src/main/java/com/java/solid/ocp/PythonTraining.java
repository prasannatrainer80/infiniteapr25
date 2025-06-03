package com.java.solid.ocp;

public class PythonTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("Python Training from Sagar Industry Person from IBM...");
	}

	@Override
	public void timing() {
		System.out.println("Timing from 7 Am to 9 AM and 8 PM to 10 PM...No Online");
	}

}
