package com.java.jsf.controller;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import com.java.ejb.EmployEjbImpl;
import com.java.jsf.dao.EmployDao;
import com.java.jsf.model.Employ;
import com.java.jsf.model.Login;

public class EmployController {

	private EmployDao employDao;
	private Employ employ;
	private com.java.ejb.Employ ejbEmploy;
	private EmployEjbImpl employEjbImpl;

	public com.java.ejb.Employ getEjbEmploy() {
		return ejbEmploy;
	}

	public void setEjbEmploy(com.java.ejb.Employ ejbEmploy) {
		this.ejbEmploy = ejbEmploy;
	}


	
	 public EmployEjbImpl getEmployEjbImpl() {
		return employEjbImpl;
	}

	public void setEmployEjbImpl(EmployEjbImpl employEjbImpl) {
		this.employEjbImpl = employEjbImpl;
	}

	private String sortField;
	    private boolean ascending = true;
	    private  List<Employ> employList;
	    
	    public void sortBy(String field) {
	        if (field.equals(sortField)) {
	            ascending = !ascending; // toggle sort direction
	        } else {
	            sortField = field;
	            ascending = true;
	        }
	    }

	    private void sortList() {
	        if (sortField == null || employList == null) return;

	        Collections.sort(employList, (e1, e2) -> {
	            try {
	                Field f = Employ.class.getDeclaredField(sortField);
	                f.setAccessible(true);
	                Comparable v1 = (Comparable) f.get(e1);
	                Comparable v2 = (Comparable) f.get(e2);
	                return ascending ? v1.compareTo(v2) : v2.compareTo(v1);
	            } catch (Exception ex) {
	                return 0;
	            }
	        });
	    }
	
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
	
	public String validate(Login login) {
		return employDao.validate(login);
	}
	public List<Employ> showEmploy() {
		employList = employDao.showEmployDao();
	     sortList();
		return employList;
//		return employDao.showEmployDao();
	}
	
	public String searchEmploy(int empno) {
		return employDao.searchEmployDao(empno);
	}
	
	public String addEmploy(Employ employ) {
		return employDao.addEmploy(employ);
	}
	
	public String addEmployEjb(com.java.ejb.Employ employ) throws ClassNotFoundException, SQLException {
		return employEjbImpl.addEmployEjb(employ);
	}
	
	public String addEmployEjbValid(com.java.ejb.Employ employ) throws ClassNotFoundException, SQLException {
		return employEjbImpl.addEmployValid(employ);
	}
	
	public List<Employ> showEmployListByDept(String dept) {
		return employDao.getEmployListByDept(dept);
	}
}
