package com.java.solid.srp;

public class MainProg {
	public static void main(String[] args) {
		Employ e1 = new Employ(1, "Namitha",88423.44);
		Employ e2 = new Employ(2, "Santosh", 84825.33);
		EmployDao employDao = new EmployDaoImpl();
		employDao.addEmployDao(e1);
		employDao.addEmployDao(e2);
		System.out.println(employDao.showEmployDao());
	}
}
