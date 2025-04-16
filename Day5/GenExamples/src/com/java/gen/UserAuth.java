package com.java.gen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {

	public static void main(String[] args) {
		String userName,passCode;
		Scanner sc = new Scanner(System.in);
		Map<String, String> userData = new HashMap<String, String>();
		userData.put("Ravi", "RaviKanth");
		userData.put("Sandhan", "Meher");
		userData.put("Sulekha", "Mishra");
		userData.put("Zainab", "Yahya");
		userData.put("Nirmalya", "Satapathy");
		System.out.println("Enter UserName and Password  ");
		userName = sc.next();
		passCode = sc.next();
		String result = userData.getOrDefault(userName, "Not Found");
		if (passCode.equals(result)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
