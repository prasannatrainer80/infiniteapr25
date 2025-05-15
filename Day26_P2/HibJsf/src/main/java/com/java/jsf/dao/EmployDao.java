package com.java.jsf.dao;

import java.util.List;

import com.java.jsf.model.Employ;
import com.java.jsf.model.Login;


public interface EmployDao {
	List<Employ> showEmployDao();
	String searchEmployDao(int empno);
	String validate(Login login);
	List<Employ> getEmployListByDept(String dept);
	String addEmploy(Employ employ);
}
