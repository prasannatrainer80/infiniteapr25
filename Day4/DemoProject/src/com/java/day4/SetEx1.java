package com.java.day4;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set names = new HashSet();
		names.add("Sourav");
		names.add("Abhishek");
		names.add("Anshu");
		names.add("Sandhan");
		names.add("Satya");
		names.add("Abhishek");
		names.add("Anshu");
		names.add("Sandhan");
		names.add("Satya");
		names.add("Abhishek");
		names.add("Anshu");
		names.add("Sandhan");
		names.add("Satya");
		names.add("Sourav");
		names.add("Abhishek");
		names.add("Anshu");
		names.add("Sandhan");
		names.add("Satya");
		names.add("Sourav");
		names.add("Abhishek");
		names.add("Anshu");
		names.add("Sandhan");
		names.add("Satya");
		System.out.println("Names are ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
