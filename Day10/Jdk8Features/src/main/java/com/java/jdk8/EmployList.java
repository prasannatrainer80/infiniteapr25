package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class EmployList {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Avesh", 48234));
		employList.add(new Employ(2, "Lata", 90323));
		employList.add(new Employ(3, "Chetan", 77423));
		employList.add(new Employ(4, "Subodh", 46533));
		employList.add(new Employ(5, "Azhar", 90323));
		employList.add(new Employ(6, "Priya", 49999));
		System.out.println("Employ List is  ");
//		employList.forEach(x -> {
//			System.out.println(x);
//		});
		employList.forEach(System.out::println);
	}
}