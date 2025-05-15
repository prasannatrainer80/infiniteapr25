package com.java.jsf.dao;

import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.java.jsf.model.Employ;
import com.java.jsf.model.Login;
import com.java.jsf.util.EncryptPassword;
import com.java.jsf.util.SessionHelper;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	Session session;
	
	private String localCode;
	
	public String getLocalCode() {
		return localCode;
	}
	
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	
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

	public void employLocaleCodeChanged(ValueChangeEvent e){
		//assign new value to localeCode
		this.localCode = e.getNewValue().toString();
		System.out.println(this.localCode);
	}
	
	
	public String addEmploy(Employ employ) {
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
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employ);
		trans.commit();
		return "Menu.jsp?faces-redirect=true";
	}
	
	public List<String> getDepartments() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Projection projection = Projections.distinct(Projections.property("dept")); 
		cr.setProjection(projection); 
		List<String> list = cr.list();
		return list;
	}
	public List<Employ> getEmployListByDept(String dept) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("dept", dept));
		List<Employ> employList = cr.list();
		return employList;
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
					return "Menu.jsp?faces-redirect=true";
				} else {
					sessionMap.put("error", "Invalid Credentials...");
					return "Login.jsp?faces-redirect=true";
				}
	}

}
