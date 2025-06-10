package com.java.hib.main;

import java.util.List;

import com.java.hib.dao.EmployDao;
import com.java.hib.dao.EmployDaoImpl;
import com.java.hib.model.Employ;

public class EmployShowMain {
	
	public static void main(String[] args) {
		EmployDao employDao = new EmployDaoImpl();
		List<Employ> employList = employDao.showEmployDao();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
