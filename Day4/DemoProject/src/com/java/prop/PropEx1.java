package com.java.prop;

/**
 * Implement Read-Only Properties
 */
public class PropEx1 {

	private int sno;
	private String name;
	public PropEx1(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		PropEx1 obj = new PropEx1(1, "Abhishek");
		System.out.println("Sno  " +obj.getSno());
		System.out.println("Student Name  " +obj.getName());
	}
	
}
