package com.java.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.jdbc.model.Employ;
import com.java.jdbc.model.Gender;
import com.java.jdbc.util.ConnectionHelper;

public class EmployDaoImpl implements EmployDao {

	Connection connection;
	PreparedStatement psmt;
	
	@Override
	public List<Employ> showEmployDao() throws ClassNotFoundException, SQLException {
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		psmt = connection.prepareStatement(cmd);
		ResultSet rs = psmt.executeQuery();
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		Employ employ = null;
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, empno);
		ResultSet rs = psmt.executeQuery();
		if(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		return employ;
	}

}
