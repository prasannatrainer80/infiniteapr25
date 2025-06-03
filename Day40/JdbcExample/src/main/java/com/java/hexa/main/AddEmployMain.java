package com.java.hexa.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.hexa.dao.EmployDao;
import com.java.hexa.dao.EmployDaoImpl;
import com.java.hexa.model.Employ;
import com.java.hexa.model.Gender;

public class AddEmployMain {
	public static void main(String[] args) {
		Employ employ = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)   ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		EmployDao dao = new EmployDaoImpl();
		try {
			System.out.println(dao.addEmployDao(employ));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
