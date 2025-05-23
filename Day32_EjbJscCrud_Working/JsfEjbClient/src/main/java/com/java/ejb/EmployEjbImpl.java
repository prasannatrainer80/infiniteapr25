package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class EmployEjbImpl {

	static EmployJdbcBeanRemote remote;
	static {
		try {
			remote = RemoteHelper.lookupRemoteStatelessEmploy();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public String addEmployEjb(Employ employ) throws ClassNotFoundException, SQLException {
		remote.addEmploy(employ);
		return "EmployDaoTable?faces-redirect=true";
	}
	
	public String deleteEmployEjb(int empno) throws ClassNotFoundException, SQLException {
		remote.deleteEmploy(empno);
		return "EmployDaoTable?faces-redirect=true";
	}
	
	public String updateEmployEjb() throws ClassNotFoundException, SQLException {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		Employ employUpdated = (Employ)sessionMap.get("employFound");
//		Employ employFound = remote.searchEmploy(empno);
		remote.updateEmploy(employUpdated);
//		 sessionMap.put("employFound", employFound);
		 return "EmployDaoTable?faces-redirect=true";
	}
	public List<Employ> showEmployEjb() throws NamingException, ClassNotFoundException, SQLException {
//	 EmployJdbcBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
	 return remote.showEmploy();
	}
	
	public String searchEmployEjb(int empno) throws ClassNotFoundException, SQLException {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		

		Employ employFound = remote.searchEmploy(empno);
		 sessionMap.put("employFound", employFound);
		 return "updateEmploy?faces-redirect=true";
	}
	
	
}
