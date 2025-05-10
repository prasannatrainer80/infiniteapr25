package com.java.hib.dao;

import java.util.List;

import com.java.hib.model.Employ;
import com.java.hib.model.Login;

public interface EmployDao {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String updateEmployDao(Employ employ);
	String addEmployDao(Employ employ);
	String deleteEmployDao(int empno);
	Login authenticate(String user, String pwd);
	int login(String user, String pwd);
}
