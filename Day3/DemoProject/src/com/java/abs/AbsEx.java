package com.java.abs;

public class AbsEx {

	public static void main(String[] args) {
		Animal[] arr = new Animal[] {
			new Lion(), new Crocodile()	
		};
		
		for (Animal animal : arr) {
			animal.name();
			animal.type();
		}
	}
}
