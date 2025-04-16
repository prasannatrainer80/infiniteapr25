package com.java.ex;

import java.util.Calendar;

public class CalEx1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.DATE, 4);
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, 2);
		System.out.println(cal.getTime());
		cal.add(Calendar.YEAR, 3);
		System.out.println(cal.getTime());
	}
}
