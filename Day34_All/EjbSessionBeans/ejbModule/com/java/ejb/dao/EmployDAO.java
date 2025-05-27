package com.java.ejb.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.ejb.model.Employ;

public interface EmployDAO {

	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
	String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String updateEmployDao(Employ employNew) throws ClassNotFoundException, SQLException;
}
