package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.naming.NamingException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.jsf.util.SessionHelper;

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
	

	public String addEmployValid(com.java.ejb.Employ employ) throws ClassNotFoundException, SQLException {
		  boolean isValid = true;
		  FacesContext context = FacesContext.getCurrentInstance();
		  if (employ.getEmpno() <= 0) {
//			  System.out.println("Failed");
			  context.addMessage("empno", new FacesMessage(FacesMessage.SEVERITY_ERROR,
	                    "Employ No Invalid", "Employ No Cannot be Negative Or Zero..."));
	            context.validationFailed();  // marks the validation as failed
	            isValid = false;
//	            return null;  // stay on same page
		  }
		  if (employ.getName().length() < 5 || employ.getName().length() > 12) {
			  context.addMessage("name", new FacesMessage(FacesMessage.SEVERITY_ERROR,
	                    "Employ Name Invalid", "Employ Name Must be 5 to 12 chars..."));
	            context.validationFailed(); 
	            isValid = false;// marks the validation as failed
//	            return null;  // stay on same page
		  }
		  if (employ.getBasic() < 10000 || employ.getBasic() > 99999) {
			  context.addMessage("basic", new FacesMessage(FacesMessage.SEVERITY_ERROR,
	                    "Basic Invalid", "Basic Must be 10000 to 99999..."));
	            context.validationFailed(); 
	            isValid = false;// marks the validation as failed
//	            return null;  // stay on same page
		  }
		  if (isValid==false) {
			  return null;
		  }
		  remote.addEmploy(employ);
			return "EmployShow?faces-redirect=true";
//		SessionFactory sf = SessionHelper.getConnection();
//		Session session = sf.openSession();
//		Transaction trans = session.beginTransaction();
//		session.save(employ);
//		trans.commit();
//		return "Menu.jsp?faces-redirect=true";
	}
	
	
	public String addEmployEjb(Employ employ) throws ClassNotFoundException, SQLException {
		remote.addEmploy(employ);
		return "EmployShow?faces-redirect=true";
	}
	
	public String deleteEmployEjb(int empno) throws ClassNotFoundException, SQLException {
		remote.deleteEmploy(empno);
		return "EmployShow?faces-redirect=true";
	}
	
	public String updateEmployEjb() throws ClassNotFoundException, SQLException {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		Employ employUpdated = (Employ)sessionMap.get("employFound");
//		Employ employFound = remote.searchEmploy(empno);
		remote.updateEmploy(employUpdated);
//		 sessionMap.put("employFound", employFound);
		 return "EmployShow?faces-redirect=true";
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
