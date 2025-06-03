package com.java.hexa.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.hexa.dao.EmployDao;
import com.java.hexa.dao.EmployDaoImpl;

public class DeleteEmployMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		EmployDao dao = new EmployDaoImpl();
		try {
			System.out.println(dao.deleteEmployDao(empno));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
