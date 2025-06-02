package com.java.jsf;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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

	@Override
	public String addGroupMembers(GroupMembers groupMember) {
		groupMember.setGmId(2);
		System.out.println(groupMember);
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(groupMember);
		trans.commit();
		return "Group Member Added...";
	}
	
	public double settlement(int grpId) {
		int adminId = 2;
//		Map<String,Object> sessionMap = 
//				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(GroupMembers.class);
		cr.add(Restrictions.eq("groupId", grpId));
		 ProjectionList projectionList = Projections.projectionList();
//		    projectionList.add(Projections.groupProperty("state"));
		    projectionList.add(Projections.sum("amountCollected"));
		    cr.setProjection(projectionList);
		double amount = (Double)cr.uniqueResult();
		
		cr = session.createCriteria(GroupMembers.class);
		cr.add(Restrictions.eq("groupId", grpId));
		 projectionList = Projections.projectionList();
//		    projectionList.add(Projections.groupProperty("state"));
		    projectionList.add(Projections.rowCount());
		    cr.setProjection(projectionList);
		long count = (Long)cr.uniqueResult();
		System.out.println("Total People Went for Tour is " +count);
		
		System.out.println("Amount Collected for Tour from All Members  " +amount);
		cr = session.createCriteria(DailyExpenses.class);
		cr.add(Restrictions.eq("groupId", grpId));
		 projectionList = Projections.projectionList();
		 cr.setProjection(projectionList);
		 projectionList.add(Projections.sum("amount"));
		 double amt = (Double)cr.uniqueResult();
		 
		 double balance = (amt - amount) / count;
		 
		 cr = session.createCriteria(DailyExpenses.class);
			cr.add(Restrictions.eq("groupId", grpId));
			 projectionList = Projections.projectionList();
			 projectionList.add(Projections.groupProperty("paidBy"));
			 projectionList.add(Projections.sum("amount"));
			 cr.setProjection(projectionList);
			 Map<Integer, Double> mapResult = new Hashtable<>();
			 List<Object[]> result = cr.list();  // cast if needed

			 for (Object[] row : result) {
			     Integer key = (Integer) row[0];
			     Double value = (Double) row[1];
			     mapResult.put(key, value);
			 }
			 Integer key;
			 Double value;
			 double actAmount, refAmount=0;
			 
			 for (Map.Entry<Integer, Double> entry : mapResult.entrySet()) {
				    key = entry.getKey();
				    value = entry.getValue();
				    if (key==adminId) {
				    	actAmount = value - 80000;
				    	refAmount = actAmount - balance;
				    } 
				    System.out.println("Paid By: " + key + ", Amount Paid: " + value);
				}
//		System.out.println(cr);
		 
		 System.out.println("Total Expense Happend for Tour is " +amt);
//		 double balance = (amt - amount) / count;
		 System.out.println("Balance to be Shared from Individual  " +balance);
		 System.out.println("Ref To be Paid To/By Admin  " +refAmount);
		return amount;
		
	}

	@Override
	public String addDailyExpenses(DailyExpenses dailyExpenses) {
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(dailyExpenses);
		trans.commit();
		return "Expense Recorded...";
	}

}
