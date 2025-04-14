package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		List data = new ArrayList();
		data.add(new Integer(24));
		data.add(new Integer(11));
		data.add(new Integer(19));
		data.add(new Integer(18));
		data.add(new Integer(12));
		int sum = 0;
		for (Object object : data) {
			int x = (Integer)object;
			sum+=x;
		}
		System.out.println("Sum is  " +sum);
	}
}
