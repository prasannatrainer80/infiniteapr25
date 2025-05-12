package com.java.hib.dao;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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

}
