package com.java.day1;

/**
 * Program to Calculate Area and Circ of circle
 */
public class CircleProg {

	public void calc(double radius) {
		double area = 3.14 * radius * radius;
		double circ = 2 * 3.14 * radius;
		System.out.println("Area of Circle  " +area);
		System.out.println("Circumference  " +circ);
	}
	
	public static void main(String[] args) {
		double radius = 9.2;
		CircleProg obj = new CircleProg();
		obj.calc(radius);
	}
}
