package com.java.day1;

public class Prog3 {
	public static void main(String[] args) {
		int x=12;
		int y = x++ + ++x + x++ + ++x;
		// 12 + 14 + 14 + 16
		System.out.println(y);
	}
}
