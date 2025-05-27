package com.java.jsf;

import java.sql.SQLException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

import com.java.ejb.beans.EmployStatefulBeanRemote;
import com.java.ejb.beans.RemoteStatefulHelper;
import com.java.ejb.model.Employ;

public class EmployEjbStatefulImpl {

	static EmployStatefulBeanRemote remote;
	
	static {
		try {
			remote = RemoteStatefulHelper.lookupRemoteStatefulEmploy();
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
}
