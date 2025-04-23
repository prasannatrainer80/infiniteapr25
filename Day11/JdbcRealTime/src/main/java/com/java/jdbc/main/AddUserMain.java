package com.java.jdbc.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.jdbc.dao.EmployDao;
import com.java.jdbc.dao.EmployDaoImpl;

public class AddUserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		String user = sc.next();
		System.out.println("Enter Password  ");
		String pwd = sc.next();
		EmployDao dao = new EmployDaoImpl();
		try {
			System.out.println(dao.addUser(user, pwd));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
