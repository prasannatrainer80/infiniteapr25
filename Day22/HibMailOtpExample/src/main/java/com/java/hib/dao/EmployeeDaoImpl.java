package com.java.hib.dao;

import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Employee;
import com.java.hib.model.Otp;
import com.java.hib.util.MailSend;
import com.java.hib.util.SessionHelper;

public class EmployeeDaoImpl implements EmployeeDao {

	SessionFactory sessionFactory;
	Session session;
	
	public int generateOtp() {
		Random r = new Random( System.currentTimeMillis() );
	    return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}
	
	@Override
	public String addEmployeeDao(Employee employee) {
		Otp otp = new Otp();
		int code = generateOtp();
		otp.setOtpNo(code);
		otp.setStatus("INACTIVE");
		otp.setUserName(employee.getUserName());
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employee);
//		trans = session.beginTransaction();
		session.save(otp);
		trans.commit();
		String subject = "Hi " +employee.getUserName() + " Your acccount created ";
		String body = "Your Otp Code is " +code + " Please Use for Password Generation";
		MailSend.sendInfo(employee.getEmail(), subject, body);
		return "Employee Record Added and Send Otp By Mail...";
	}

	public String getAlphaNumericString()
	 {
	 
	  // choose a Character random from this String
	  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	         + "0123456789"
	         + "abcdefghijklmnopqrstuvxyz";
	 
	  // create StringBuffer size of AlphaNumericString
	  StringBuilder sb = new StringBuilder(10);
	 
	  for (int i = 0; i < 10; i++) {
	 
	   // generate a random number between
	   // 0 to AlphaNumericString variable length
	   int index
	    = (int)(AlphaNumericString.length()
	      * Math.random());
	 
	   // add Character one by one in end of sb
	   sb.append(AlphaNumericString
	      .charAt(index));
	  }
	 
	  return sb.toString();
	 }

	
	@Override
	public String generatePassword(String user, int otp) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Otp.class);
		cr.add(Restrictions.eq("userName", user));
		cr.add(Restrictions.eq("otpNo", otp));
		cr.add(Restrictions.eq("status", "INACTIVE"));
		Otp objOtp = (Otp)cr.uniqueResult();
		if (objOtp != null) {
			Query query = session.createQuery("from Employee where userName='"+user+"'");
			Employee employee = (Employee)query.uniqueResult();
			String pwd = getAlphaNumericString();
			objOtp.setStatus("ACTIVE");
			objOtp.setnPassword(pwd);
			Transaction trans = session.beginTransaction();
			session.update(objOtp);
			trans.commit();
			String body = "Your One-Time Password for Login is " +pwd;
			MailSend.sendInfo(employee.getEmail(), "One Time Password", body);
			return "Your One-Time password Generated and Emailed to you...";
		}
		return "Employ Record Not Found...Otp or username wrong...";
	}

}
