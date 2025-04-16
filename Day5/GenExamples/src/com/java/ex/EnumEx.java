package com.java.ex;

import java.util.Scanner;

public class EnumEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		String gen = sc.next();
		try {
			Gender gender = Gender.valueOf(gen);
			System.out.println(gender);
		} catch (IllegalArgumentException e) {
			System.err.println("No Enum Exists with " +gen);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
