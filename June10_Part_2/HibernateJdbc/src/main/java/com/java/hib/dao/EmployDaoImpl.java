package com.java.hib.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class EmployDaoImpl implements EmployDao {

	static SessionFactory sessionFactory;
	Session session;
	
	static {
		sessionFactory = SessionHelper.getConnection();
	}
	
	@Override
	public List<Employ> showEmployDao() {
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ where empno = "+empno);
		Employ employ = (Employ)query.uniqueResult();
		return employ;
	}

	@Override
	public String addEmployDao(Employ employ) {
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employ);
		trans.commit();
		return "Employ Record Inserted...";
	}

	@Override
	public String updateEmployDao(Employ employUpdated) {
		Employ employFound = searchEmployDao(employUpdated.getEmpno());
		if (employFound != null) {
			session = sessionFactory.openSession();
			Transaction trans = session.beginTransaction();
			session.update(employUpdated);
			trans.commit();
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound != null) {
			session = sessionFactory.openSession();
			Transaction trans = session.beginTransaction();
			session.delete(employFound);
			trans.commit();
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

}
