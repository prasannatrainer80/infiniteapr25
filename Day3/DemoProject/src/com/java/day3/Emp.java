package com.java.day3;

public class Emp {

	int empno;
	String name;
	double basic;
	
	public Emp() {

	}

	public Emp(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	public static void main(String[] args) {
		Emp emp1 = new Emp(12, "Zainab", 88244.22);
		System.out.println(emp1);
	}
	
}
