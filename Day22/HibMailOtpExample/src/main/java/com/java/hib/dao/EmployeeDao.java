package com.java.hib.dao;

import com.java.hib.model.Employee;

public interface EmployeeDao {
	String addEmployeeDao(Employee employee);
	String generatePassword(String user, int otp);
}
