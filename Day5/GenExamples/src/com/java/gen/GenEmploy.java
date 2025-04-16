package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Sourav", 99234.22));
		employList.add(new Employ(2, "Ananth", 99235.22));
		employList.add(new Employ(3, "Swathi", 89992.22));
		employList.add(new Employ(4, "Zainab", 87777.24));
		employList.add(new Employ(5, "Purnendu", 97777.23));
		
		System.out.println("Employ List is  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
