package com.java.day4;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector vector = new Vector(3,2);
		System.out.println("Size  " +vector.size());
		System.out.println("Capacity  " +vector.capacity());
		vector.add("Usha");
		vector.add("Ananta");
		vector.add("Anshu");
		System.out.println("Size  " +vector.size());
		System.out.println("Capacity  " +vector.capacity());
		vector.add("Zainab");
		System.out.println("Size  " +vector.size());
		System.out.println("Capacity  " +vector.capacity());
		System.out.println(vector);
	}
}
