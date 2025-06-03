package com.java.hexa.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.hexa.model.Employ;

public interface EmployDao {
	List<Employ> showEmployDao() throws SQLException;
	Employ searchEmployDao(int empno) throws SQLException;
	String addEmployDao(Employ employ) throws SQLException;
	String deleteEmployDao(int empno) throws SQLException;
	String updateEmployDao(Employ employ) throws SQLException;
}
