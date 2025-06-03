package com.java.hexa.dao;

import java.sql.SQLException;

import com.java.hexa.model.Customer;

public interface CustomerDao {
	String addCustomerDao(Customer customer) throws SQLException;
}
