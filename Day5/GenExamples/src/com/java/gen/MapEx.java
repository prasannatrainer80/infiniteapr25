package com.java.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> employList = new Hashtable<Integer, String>();
		employList.put(1, "Sandhan");
		employList.put(2, "Ananth");
		employList.put(3, "Purnendu");
		employList.put(4, "Nirmalya");
		employList.put(5, "Sulekha");
		int empno;
		String result;
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		result = employList.getOrDefault(empno, "Not Found");
		System.out.println(result);
	}
}
