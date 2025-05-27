package com.java.ejb.beans;

import java.sql.SQLException;

import javax.ejb.Remote;

import com.java.ejb.model.Employ;

@Remote
public interface EmployStatefulBeanRemote {
	String addEmploy(Employ employ) throws ClassNotFoundException, SQLException;
	String deleteEmploy(int empno) throws ClassNotFoundException, SQLException;
	String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException;
}
