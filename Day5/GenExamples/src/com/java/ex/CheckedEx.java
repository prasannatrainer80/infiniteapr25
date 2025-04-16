package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckedEx {

	public void show(String strDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(strDate);
		System.out.println(date);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date (yyyy-MM-dd) format  ");
		String strDate = sc.next();
		CheckedEx obj = new CheckedEx();
		try {
			obj.show(strDate);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
	}
}
