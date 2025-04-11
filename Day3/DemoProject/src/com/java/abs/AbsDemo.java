package com.java.abs;

public class AbsDemo {
	public static void main(String[] args) {
		
		Training[] arr = new Training[] {
			new Aman(), new Sourav(), new Satya()	
		};
		
		for (Training training : arr) {
			training.name();
			training.email();
		}
		
	}
}
