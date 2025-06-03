package com.java.hexa.main;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

import com.java.hexa.dao.EmployDao;
import com.java.hexa.dao.EmployDaoImpl;
import com.java.hexa.model.Employ;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Id  ");
		empno = sc.nextInt();
		EmployDao dao = new EmployDaoImpl();
		
//		try {
//			Employ result = dao.searchEmployDao(empno);
//			if (result!=null) {
//				System.out.println(result);
//			} else {
//				System.out.println("Not Found");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			Optional<Employ> employFound = Optional.ofNullable(dao.searchEmployDao(empno));
			if (employFound.isPresent()) {
				System.out.println(employFound);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
