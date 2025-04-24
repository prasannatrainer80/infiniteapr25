package com.java.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.bank.model.Accounts;
import com.java.bank.util.ConnectionHelper;

public class BankDaoImpl implements BankDao {

	Connection connection;
	PreparedStatement psmt;
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		String cmd = "select case when max(accountNo) IS NULL THEN 1 "
				+ " else max(accountNo)+1 end accno from accounts"; 
		connection = ConnectionHelper.getConnection();
		psmt = connection.prepareStatement(cmd);
		ResultSet rs = psmt.executeQuery();
		rs.next();
		return rs.getInt("accno");
	}
	
	@Override
	public String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException {
		int id = generateAccountNo();
		accounts.setAccountNo(id);
		String cmd = "Insert into Accounts(AccountNo, FirstName, LastName, City, State, "
				+ "Amount, CheqFacil, AccountType) values(?,?,?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, accounts.getAccountNo());
		psmt.setString(2, accounts.getFirstName());
		psmt.setString(3, accounts.getLastName());
		psmt.setString(4, accounts.getCity());
		psmt.setString(5, accounts.getState());
		psmt.setDouble(6, accounts.getAmount());
		psmt.setString(7, accounts.getCheqFacil());
		psmt.setString(8, accounts.getAccountType());
		psmt.executeUpdate();
		return "Account Created with Account No  " +id;
	}

	@Override
	public Accounts searchAccount(int accountNo) throws ClassNotFoundException, SQLException {
		Accounts accounts = null;
		String cmd = "select * from accounts where accountNo = ?";
		connection = ConnectionHelper.getConnection();
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, accountNo);
		ResultSet rs = psmt.executeQuery();
		if (rs.next()) {
			accounts = new Accounts();
			accounts.setAccountNo(rs.getInt("accountNo"));
			accounts.setFirstName(rs.getString("firstName"));
			accounts.setLastName(rs.getString("lastName"));
			accounts.setCity(rs.getString("city"));
			accounts.setState(rs.getString("state"));
			accounts.setAmount(rs.getDouble("amount")); 
			accounts.setCheqFacil(rs.getString("cheqFacil"));
			accounts.setAccountType(rs.getString("accountType"));
		}
		return accounts;
	}

	@Override
	public String depositAccount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		Accounts accounts = searchAccount(accountNo);
		if (accounts!=null) {
			String cmd = "Update Accounts Set Amount = Amount + ? Where AccountNo = ?";
			psmt = connection.prepareStatement(cmd);
			psmt.setDouble(1, depositAmount);
			psmt.setInt(2, accountNo);
			psmt.executeUpdate();
			cmd = "Insert into Trans(AccountNo,TransAmount,TransType) values(?,?,?)";
			psmt = connection.prepareStatement(cmd);
			psmt.setInt(1, accountNo);
			psmt.setDouble(2, depositAmount);
			psmt.setString(3, "C");
			psmt.executeUpdate();
			return "Amount Credited...";
		}
		return "Account No Not Found...";
	}

}
