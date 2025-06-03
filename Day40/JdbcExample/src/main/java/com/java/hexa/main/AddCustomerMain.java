package com.java.hexa.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.hexa.dao.CustomerDaoImpl;
import com.java.hexa.model.Customer;

public class AddCustomerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println("Enter Customer Name  ");
		customer.setCustomerName(sc.next());
		System.out.println("Enter City  ");
		customer.setCity(sc.next());
		System.out.println("Enter Mobile No  ");
		customer.setMobile(sc.next());
		try {
			System.out.println(new CustomerDaoImpl().addCustomerDao(customer));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
