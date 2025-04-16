package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenStrEx {

	public static void main(String[] args) {
//		List names = new ArrayList();
		List<String> names = new ArrayList<String>();
		names.add("Nirmalya");
		names.add("Sulekha");
		names.add("Ravi");
		names.add("Anantha");
		names.add("Sourav");
//		names.add(12);
		System.out.println("Names are  ");
		for (String string : names) {
			System.out.println(string);
		}
	}
}
