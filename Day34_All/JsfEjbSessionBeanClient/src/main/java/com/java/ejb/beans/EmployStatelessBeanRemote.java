package com.java.ejb.beans;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

import com.java.ejb.model.Employ;

@Remote
public interface EmployStatelessBeanRemote {
	List<Employ> showEmploy() throws ClassNotFoundException, SQLException;
	Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException;
}
