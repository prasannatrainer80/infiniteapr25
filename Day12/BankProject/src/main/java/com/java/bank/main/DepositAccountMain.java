package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountNo;
		double depositAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No  ");
		accountNo = sc.nextInt();
		System.out.println("Enter Deposit Amount  ");
		depositAmount = sc.nextDouble();
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.depositAccount(accountNo, depositAmount));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
