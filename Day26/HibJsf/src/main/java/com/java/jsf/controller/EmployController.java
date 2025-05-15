package com.java.jsf.controller;

import java.util.List;

import com.java.jsf.dao.EmployDao;
import com.java.jsf.model.Employ;

public class EmployController {

	private EmployDao employDao;
	private Employ employ;
	
	public EmployDao getEmployDao() {
		return employDao;
	}
	public void setEmployDao(EmployDao employDao) {
		this.employDao = employDao;
	}
	public Employ getEmploy() {
		return employ;
	}
	public void setEmploy(Employ employ) {
		this.employ = employ;
	}
	
	public List<Employ> showEmploy() {
		return employDao.showEmployDao();
	}
	
	public String searchEmploy(int empno) {
		return employDao.searchEmployDao(empno);
	}
}
