package com.java.day3;

public class StaticEx1 {

	static int count;
	
	public void increment() {
		count++;
		System.out.println("Count is  " +count);
	}
	
	public static void main(String[] args) {
		StaticEx1 obj1 = new StaticEx1();
		StaticEx1 obj2 = new StaticEx1();
		StaticEx1 obj3 = new StaticEx1();
		
		obj1.increment();
		obj2.increment();
		obj3.increment();
	}
}
