package com.java.day4;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employ employ1 = (Employ) o1;
		Employ employ2 = (Employ) o2;
		return employ1.name.compareTo(employ2.name);
	}

}
