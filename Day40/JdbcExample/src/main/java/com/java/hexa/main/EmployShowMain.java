package com.java.hexa.main;

import java.sql.SQLException;
import java.util.List;

import com.java.hexa.dao.EmployDao;
import com.java.hexa.dao.EmployDaoImpl;
import com.java.hexa.model.Employ;

public class EmployShowMain {
	public static void main(String[] args) {
		EmployDao dao = new EmployDaoImpl();
		try {
			List<Employ> employList = dao.showEmployDao();
			employList.forEach(x -> {
				System.out.println(x);
			});
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
