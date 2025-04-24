package com.java.bank.dao;

import java.sql.SQLException;

import com.java.bank.model.Accounts;

public interface BankDao {
	
	String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException;
	Accounts searchAccount(int accountNo) throws ClassNotFoundException, SQLException;
	
}
