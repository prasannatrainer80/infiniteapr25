package com.java.jsf.dao;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.jsf.model.Employ;
import com.java.jsf.model.Login;
import com.java.jsf.util.EncryptPassword;
import com.java.jsf.util.SessionHelper;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmployDao() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public String searchEmployDao(int empno) {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("empno",empno);   
		Employ employ = (Employ)query.uniqueResult();
		sessionMap.put("employFound", employ);
		return "SearchEmploy.jsp?faces-redirect=true";
	}

	@Override
	public String validate(Login login) {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				session = SessionHelper.getConnection().openSession();
				Query query = session.getNamedQuery("authenticate");
				String encr = EncryptPassword.getCode(login.getPassCode());
				query.setParameter("userName",login.getUserName());
				query.setParameter("passCode",encr);
				Login loginFound = (Login)query.uniqueResult();
				if (loginFound!=null) {
					return "EmployShow.jsp?faces-redirect=true";
				} else {
					sessionMap.put("error", "Invalid Credentials...");
					return "Login.jsp?faces-redirect=true";
				}
	}

}
