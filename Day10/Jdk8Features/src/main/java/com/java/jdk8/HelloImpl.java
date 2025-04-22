package com.java.jdk8;

public class HelloImpl {

	public static void main(String[] args) {
		IHello obj1 = () -> {
			System.out.println("Welcome to Java Programming...");
		};
		
		IHello obj2 = () -> {
			System.out.println("From Prasanna Trainer...");
		};
		
		IHello obj3 = () -> {
			System.out.println("Jdk 8 features going on...");
		};
		
		obj1.show();
		obj2.show();
		obj3.show();
	}
}
