package com.java.jdk8;

class Calc {
	
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

public class MethodRefEx {
	public static void main(String[] args) {
		Calc obj1 = new Calc();
		ICalculation c1 = obj1::sum;
		System.out.println("Sum is " +c1.calc(12, 5));
		ICalculation c2 = obj1::sub;
		System.out.println("Sub is  " +c2.calc(12, 5));
		ICalculation c3 = obj1::mult;
		System.out.println("Mult is " +c3.calc(12, 5));
	}
}
