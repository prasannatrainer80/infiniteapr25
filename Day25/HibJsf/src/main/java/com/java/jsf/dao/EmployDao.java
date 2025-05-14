package com.java.jsf.dao;

import java.util.List;

import com.java.jsf.model.Employ;


public interface EmployDao {
	List<Employ> showEmployDao();
	String searchEmployDao(int empno);
}
