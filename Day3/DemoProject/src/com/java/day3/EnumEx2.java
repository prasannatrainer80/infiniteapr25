package com.java.day3;

enum WeekDays {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumEx2 {
	public static void main(String[] args) {
		WeekDays wd = WeekDays.WEDNESDAY;
		System.out.println(wd);
		
		String str = "SUNDAY";
		WeekDays wd1 = WeekDays.valueOf(str);
		System.out.println(wd1);
	}
}
