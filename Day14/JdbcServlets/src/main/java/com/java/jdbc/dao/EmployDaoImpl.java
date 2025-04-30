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
import com.java.jdbc.util.EncryptPassword;

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

	@Override
	public String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, employ.getEmpno());
		psmt.setString(2, employ.getName());
		psmt.setString(3, employ.getGender().toString());
		psmt.setString(4, employ.getDept());
		psmt.setString(5, employ.getDesig());
		psmt.setDouble(6, employ.getBasic());
		psmt.executeUpdate();
		return "Employ Record Inserted...";
	}

	@Override
	public String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException {
		Employ employFound = searchEmployDao(empno);
		if (employFound !=null) {
			String cmd = "Delete from Employ where Empno = ?";
			connection = ConnectionHelper.getConnection();
			psmt = connection.prepareStatement(cmd);
			psmt.setInt(1, empno);
			psmt.executeUpdate();
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String updateEmployDao(Employ employUpdated) throws ClassNotFoundException, SQLException {
		Employ employFound = searchEmployDao(employUpdated.getEmpno());
		if (employFound==null) {
			return "Employ Record Not Found...";
		}
		String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? Where empno = ?";
		connection = ConnectionHelper.getConnection();
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, employUpdated.getName());
		psmt.setString(2, employUpdated.getGender().toString());
		psmt.setString(3, employUpdated.getDept());
		psmt.setString(4, employUpdated.getDesig());
		psmt.setDouble(5, employUpdated.getBasic());
		psmt.setInt(6, employUpdated.getEmpno());
		psmt.executeUpdate();
		return "Employ Record Updated...";
	}

	@Override
	public String addUser(String user, String pwd) throws ClassNotFoundException, SQLException {
		String encr = EncryptPassword.getCode(pwd);
		String cmd = "insert into Login values(?,?)";
		connection = ConnectionHelper.getConnection();
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, user);
		psmt.setString(2, encr);
		psmt.executeUpdate();
		return "User Account Created...";
	}

	@Override
	public int authenticate(String user, String pwd) throws ClassNotFoundException, SQLException {
		String encr = EncryptPassword.getCode(pwd);
		String cmd = "select count(*) cnt from Login where userName=? and passCode=?";
		connection = ConnectionHelper.getConnection();
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, user); 
		psmt.setString(2, encr);
		ResultSet rs = psmt.executeQuery();
		rs.next();
		
		return rs.getInt("cnt");
	}

}
