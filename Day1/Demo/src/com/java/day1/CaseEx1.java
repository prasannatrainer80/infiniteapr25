package com.java.day1;

public class CaseEx1 {
	public void show(int choice) {
		switch(choice) {
		case 1 : 
			System.out.println("Hi I am Satya...");
			break;
		case 2 : 
			System.out.println("Hi I am Aman Kumar...");
			break;
		case 3 : 
			System.out.println("Hi I am Sandhan...");
			break;
		case 4 : 
			System.out.println("Hi I am Usha...");
			break;
		case 5 : 
			System.out.println("Hi I am Anantha...");
			break;
		default : 
			System.out.println("Invalid Choice");
		}
	}
	public static void main(String[] args) {
		int choice = 3;
		CaseEx1 obj = new CaseEx1();
		obj.show(choice);
	}
}
