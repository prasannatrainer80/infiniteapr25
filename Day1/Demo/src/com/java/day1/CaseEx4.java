package com.java.day1;

public class CaseEx4 {


	public int show(int year, int month) {
		int result = switch(month) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		case 2 -> {
			if (year%4==0) {
				System.out.println("Its Leap Year you have 29 days...");
				yield 29;
			} else {
				System.out.println("Its Not Leap Year it has 28 Days only...");
				yield 28;
			}
		}
		default -> {
			System.out.println("Invalid Month...");
			yield 0;
		}
		};
		return result;
	}
	
	public static void main(String[] args) {
		CaseEx4 obj = new CaseEx4();
		System.out.println(obj.show(2024, 2));
	}
}
