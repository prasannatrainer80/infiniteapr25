package com.java.day1;

public class Voting {

	public void check(int age) {
		if (age < 1 || age >100) {
			System.err.println("Please enter valid range 1 to 100 only");
			return;
		}
		if (age >= 18) {
			System.out.println("You Can Vote...");
		} else {
			System.out.println("You are not authorized for voting...");
		}
	}
	public static void main(String[] args) {
		int age = 88888;
		Voting obj = new Voting();
		obj.check(age);
	}
}
