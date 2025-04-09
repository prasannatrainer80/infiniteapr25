package com.java.day1;

public class CaseEx3 {

	public void show(int month) {
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.println("Month Has  31 Days...");
		case 4,6,9,11 -> System.out.println("Month has 30 Days");
		case 2 -> System.out.println("Month is either 29 or 28 days...");
		default -> System.out.println("Invalid Month...");
		}
	}
	public static void main(String[] args) {
		int month=4;
		CaseEx3 obj = new CaseEx3();
		obj.show(month);
	}
}
