package com.java.ejb;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class EjbImpl {

	static EmployBeanRemote remote;
	static {
		try {
			remote = RemoteHelper.lookUpRemoteStatelessEmployNew();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Employ> showEmployEjb() {
//		EmployBeanRemote remote = RemoteHelper.lookUpRemoteStatelessEmployNew();
		return remote.showEmployee();
	}
	
	public String searchEmployEjb(int empno) {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		Employ employFound = remote.searchEmployee(empno);
		 sessionMap.put("employFound", employFound);
		return "updateEmploy.jsp?faces-redirect=true";
	}
	
	public String addEmployEjb(Employ employ) {
		remote.addEmployee(employ);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}
	
	public String updateEmployEjb() {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		Employ employUpdated = (Employ)sessionMap.get("employFound");
//		Employ employFound = remote.searchEmploy(empno);
		remote.updateEmployee(employUpdated);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}
	
	public String deleteEmployEjb(int empno) {
		remote.deleteEmployee(empno);
		return "EmployDaoTable?faces-redirect=true";
	}
}
