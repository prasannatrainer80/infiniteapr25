package com.java.solid.dip;

public class DotnetInfo implements ITrainerData {

	@Override
	public void name() {
		System.out.println("Name is Santosh...");
	}

	@Override
	public void city() {
		System.out.println("City is Chennai...");
	}

	@Override
	public void email() {
		System.out.println("Email is santosh@gmail.com");
	}

}
