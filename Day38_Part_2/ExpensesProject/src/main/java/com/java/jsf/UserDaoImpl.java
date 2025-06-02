package com.java.jsf;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDaoImpl implements UserDao {

	static SessionFactory sessionFactory;
	Session session;
	
	static {
		sessionFactory = SessionHelper.getConnection();
	}
	
	@Override
	public String addUserDao(Users user) {
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(user);
		trans.commit();
		return "User Added...";
	}

	@Override
	public List<Users> showUserDao() {
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Users.class);
		return cr.list();
	}

	@Override
	public String addGroup(TravelGroup travelGroup) {
		System.out.println(travelGroup);
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(travelGroup);
		trans.commit();
		System.out.println("Got");
		return "Travel Group Added...";
	}

}
