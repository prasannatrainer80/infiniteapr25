package com.java.hib.main;

import java.util.Scanner;

import com.java.hib.dao.EmployDao;
import com.java.hib.dao.EmployDaoImpl;
import com.java.hib.model.Employ;

public class EmployDeleteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		int empno = sc.nextInt();
		EmployDao employDao = new EmployDaoImpl();
		System.out.println(employDao.deleteEmployDao(empno));
	}
}
