package com.java.ejb.beans;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.java.ejb.dao.EmployDAO;
import com.java.ejb.dao.EmployDAOImpl;
import com.java.ejb.model.Employ;

/**
 * Session Bean implementation class EmployStatelessBean
 */
@Stateless
@Remote(EmployStatelessBeanRemote.class)
public class EmployStatelessBean implements EmployStatelessBeanRemote {
	
	static EmployDAO daoImpl;
	
	static {
		daoImpl = new EmployDAOImpl();
	}
    /**
     * Default constructor. 
     */
    public EmployStatelessBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Employ> showEmploy() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.showEmployDao();
	}

	@Override
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.searchEmployDao(empno);
	}

}
