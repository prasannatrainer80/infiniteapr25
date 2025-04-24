package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;
import com.java.bank.model.Accounts;

public class CreateAccountMain {
	public static void main(String[] args) {
		Accounts accounts = new Accounts();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FirstName  ");
		accounts.setFirstName(sc.next());
		System.out.println("Enter LastName  ");
		accounts.setLastName(sc.next());
		System.out.println("Enter City  ");
		accounts.setCity(sc.next());
		System.out.println("Enter State  ");
		accounts.setState(sc.next());
		System.out.println("Enter Amount  ");
		accounts.setAmount(sc.nextDouble());
		System.out.println("Enter CheqFacil(Yes/No)  ");
		accounts.setCheqFacil(sc.next());
		System.out.println("Enter AccountType  ");
		accounts.setAccountType(sc.next());
		BankDao bankDao = new BankDaoImpl();
		try {
			System.out.println(bankDao.createAccount(accounts));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
