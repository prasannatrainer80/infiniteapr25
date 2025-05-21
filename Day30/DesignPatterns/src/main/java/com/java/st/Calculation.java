package com.java.st;

public class Calculation {
	private Calculation() {}
	private static Calculation calculation;
	public static Calculation getInstance() {
		if (calculation == null) {
			calculation = new Calculation();
		}
		return calculation;
	}
	public int sum(int x, int y) {
		return x + y;
	}
	public int sub(int x, int y) {
		return x - y;
	}
	public int mult(int x, int y) {
		return x * y;
	}
}
