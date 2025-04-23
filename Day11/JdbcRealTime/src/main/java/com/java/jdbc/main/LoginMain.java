package com.java.jdbc.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.jdbc.dao.EmployDao;
import com.java.jdbc.dao.EmployDaoImpl;

public class LoginMain {
	public static void main(String[] args) {
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User  ");
		user = sc.next();
		System.out.println("Enter Password  ");
		pwd = sc.next();
		EmployDao dao = new EmployDaoImpl();
		try {
			int count =dao.authenticate(user, pwd);
			if (count==1) {
				System.out.println("Correct Credentials...");
			} else {
				System.out.println("Invalid Credentials...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
