package com.java.lms.dao;


import java.sql.SQLException;
import java.util.List;

import com.java.lms.model.Employee;

public interface EmployeeDAO {

	List<Employee> showEmployeeDao() throws ClassNotFoundException, SQLException;
	Employee searchEmployeeDao(int empId) throws ClassNotFoundException, SQLException;
}
