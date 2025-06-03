package com.java.solid.ocp;

public class JavaTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("Hi Batch from Dr. Ratna Sir timing at 3 AM IST...");
	}

	@Override
	public void timing() {
		System.out.println("Its Offline and Online Batch...Strict to Timing...");
	}

}
