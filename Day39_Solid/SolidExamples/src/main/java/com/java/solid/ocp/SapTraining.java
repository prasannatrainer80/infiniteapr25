package com.java.solid.ocp;

public class SapTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("Its SAP Training for ABAP and BW modules...");
	}

	@Override
	public void timing() {
		System.out.println("Weekend batch from 9 AM to 9 PM...");
	}

}
