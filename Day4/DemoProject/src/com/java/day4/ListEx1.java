package com.java.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Sourav");
		names.add("Abhishek");
		names.add("Anshu");
		names.add("Sandhan");
		names.add("Satya");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.add(2, "Ravi");
		System.out.println("Names after Insert Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.set(2, "Ravikanth");
		System.out.println("Names after Update Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.remove("Satya");
		System.out.println("Names after Remove Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		System.out.println("Sorted data ");
		System.out.println("---------------------");
		Collections.sort(names);
		
		for (Object object : names) {
			System.out.println(object);
		}
		System.out.println("-----------------------");
	}
}
