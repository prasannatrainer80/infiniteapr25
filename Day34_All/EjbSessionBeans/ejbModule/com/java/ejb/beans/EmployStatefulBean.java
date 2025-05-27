package com.java.ejb.beans;

import java.sql.SQLException;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateful;

import com.java.ejb.dao.EmployDAO;
import com.java.ejb.dao.EmployDAOImpl;
import com.java.ejb.model.Employ;

/**
 * Session Bean implementation class EmployStatefulBean
 */
@Stateful
@Remote(EmployStatefulBeanRemote.class)
public class EmployStatefulBean implements EmployStatefulBeanRemote {

    /**
     * Default constructor. 
     */
	
	
	static EmployDAO daoImpl;
	
	static {
		daoImpl = new EmployDAOImpl();
	}

    public EmployStatefulBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.addEmployDao(employ);
	}

	@Override
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.deleteEmployDao(empno);
	}

	@Override
	public String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.updateEmployDao(employ);
	}

}
