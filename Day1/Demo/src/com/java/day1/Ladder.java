package com.java.day1;

public class Ladder {

	public void show(int rollNo) {
		if (rollNo == 1) {
			System.out.println("Hi I am Saurabh");
		} else if (rollNo == 2) {
			System.out.println("Hi I am Swati");
		} else if (rollNo == 3) {
			System.out.println("Hi I am Usha...");
		} else if (rollNo == 4) {
			System.out.println("Hi I am Nirmalya...");
		} else if (rollNo == 5) {
			System.out.println("Hi I am Ishani...");
		} else {
			System.out.println("Invalid RollNo...");
		}
	}
	public static void main(String[] args) {
		int rollNo = 3;
		Ladder obj = new Ladder();
		obj.show(rollNo);
	}
}
