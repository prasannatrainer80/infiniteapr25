package com.java.st;

public class SingletonExample {

	public static void main(String[] args) {
		Calculation obj1 = Calculation.getInstance();
		System.out.println("Sum " +obj1.sum(12, 5));
		System.out.println("Sub  " +obj1.sub(12, 5));
		System.out.println("Mult  " +obj1.mult(12, 5));
	}
}
