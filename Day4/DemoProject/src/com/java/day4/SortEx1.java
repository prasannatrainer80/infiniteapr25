package com.java.day4;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEx1 {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Sourav");
		names.add("Abhishek");
		names.add("Anshu");
		names.add("Sandhan");
		names.add("Satya");
		names.add("Abhishek");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
