package com.java.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
//		Comparator<Employ> c = new BasicComparator();
//		Comparator<Employ> c = new NameComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>();
		employList.add(new Employ(1, "Sourav", 99234.22));
		employList.add(new Employ(5, "Ananth", 99235.22));
		employList.add(new Employ(2, "Swathi", 89992.22));
		employList.add(new Employ(3, "Zainab", 87777.24));
		employList.add(new Employ(7, "Purnendu", 97777.23));
		employList.add(new Employ(4, "Anshu", 99972.44));
		employList.add(new Employ(6, "Usha", 97721.44));
		
		System.out.println("Sorted Employ List  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
