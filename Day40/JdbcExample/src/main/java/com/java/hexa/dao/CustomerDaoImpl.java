package com.java.hexa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.hexa.model.Customer;
import com.java.hexa.util.ConnectionHelper;

public class CustomerDaoImpl implements CustomerDao {

	static Connection connection;
	PreparedStatement psmt;
	
	static {
		try {
			connection = ConnectionHelper.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String addCustomerDao(Customer customer) throws SQLException {
		if (customer.getCustomerName().length() < 5 || 
				customer.getCustomerName().length() > 10) {
			return "Customer Name Contains 5 to 10 characters...";
		} else if (customer.getCity().length() < 3) {
			return "Customer City Contains Min 3 characters...";
		} else if (customer.getMobile().length() != 10) {
			return "Customer Mobile Contains Min 10 Characters...";
		}
		String cmd = "Insert into Customer(customerName,city,mobile) values(?,?,?)";
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, customer.getCustomerName());
		psmt.setString(2, customer.getCity());
		psmt.setString(3, customer.getMobile());
		psmt.executeUpdate();
		return "Customer Record Inserted...";
	}

}
