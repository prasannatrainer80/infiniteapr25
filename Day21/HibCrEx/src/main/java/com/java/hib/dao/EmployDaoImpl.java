package com.java.hib.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Employ;
import com.java.hib.model.Login;
import com.java.hib.util.EncryptPassword;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmployDao() {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		return cr.list();
	}

	@Override
	public Employ searchEmployDao(int empno) {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("empno", empno));
		Employ employ = (Employ)cr.uniqueResult();
		return employ;
	}

	@Override
	public String updateEmployDao(Employ employ) {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(employ);
		trans.commit();
		return "Employ Record Updated...";
	}

	@Override
	public String addEmployDao(Employ employ) {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employ);
		trans.commit();
		return "Employ Record Inserted...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Employ employ = searchEmployDao(empno);
		Transaction trans = session.beginTransaction();
		session.delete(employ);
		trans.commit();
		return "Employ Record Deleted...";
	}

	@Override
	public Login authenticate(String user, String pwd) {
		String encr = EncryptPassword.getCode(pwd);
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", user));
		cr.add(Restrictions.eq("passCode", encr));
		Login login = (Login)cr.uniqueResult();
		System.out.println("Login is " +login);
		return login;
	}

	@Override
	public int login(String user, String pwd) {
		String encr = EncryptPassword.getCode(pwd);
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", user));
		cr.add(Restrictions.eq("passCode", encr));
		cr.setProjection(Projections.rowCount());
		int  count =(Integer)cr.uniqueResult();
		return count;
	}

}
