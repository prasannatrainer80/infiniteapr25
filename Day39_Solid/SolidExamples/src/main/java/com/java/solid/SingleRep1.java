package com.java.solid;

public class SingleRep1 {
	public static void main(String[] args) {
		Employ e1 = new Employ(1, "Ram", 94923.33);
		e1.addEmploy(e1);
		System.out.println(e1.showEmploy());
	}
}
