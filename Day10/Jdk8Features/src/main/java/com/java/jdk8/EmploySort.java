package com.java.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Avesh", 48234));
		employList.add(new Employ(2, "Lata", 90323));
		employList.add(new Employ(3, "Chetan", 77423));
		employList.add(new Employ(4, "Subodh", 46533));
		employList.add(new Employ(5, "Azhar", 90323));
		employList.add(new Employ(6, "Priya", 49999));
		
		System.out.println("Sort By Name-wise");
		Collections.sort(employList, (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		employList.forEach(System.out::println);
	}
}
