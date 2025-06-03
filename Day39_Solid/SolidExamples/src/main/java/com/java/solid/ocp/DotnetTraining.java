package com.java.solid.ocp;

public class DotnetTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("Dotnet Training from Peers Technology...");
	}

	@Override
	public void timing() {
		System.out.println("Its Evening batch from 7.30 to 9.30 PM");
	}

}
