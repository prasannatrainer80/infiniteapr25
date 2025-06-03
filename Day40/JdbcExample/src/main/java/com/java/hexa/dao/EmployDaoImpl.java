package com.java.hexa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.java.hexa.model.Employ;
import com.java.hexa.model.Gender;
import com.java.hexa.util.ConnectionHelper;

public class EmployDaoImpl implements EmployDao {
	
	static Connection connection;
	PreparedStatement psmt;
	
	static {
		try {
			connection = ConnectionHelper.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employ> showEmployDao() throws SQLException {
		String cmd = "select * from Employ";
		psmt = connection.prepareStatement(cmd);
		ResultSet rs = psmt.executeQuery();
		Employ employ = null;
		List<Employ> employList = new ArrayList<Employ>();
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
	public Employ searchEmployDao(int empno) throws SQLException {
		String cmd = "select * from Employ where empno = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, empno);
		ResultSet rs = psmt.executeQuery();
		Employ employ = null;
		if (rs.next()) {
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
	public String addEmployDao(Employ employ) throws SQLException {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
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
	public String deleteEmployDao(int empno) throws SQLException {
		Optional<Employ> employFound = Optional.ofNullable(searchEmployDao(empno));
		if (employFound.isPresent()) {
			String cmd = "Delete From Employ where empno = ?";
			psmt = connection.prepareStatement(cmd);
			psmt.setInt(1, empno);
			psmt.executeUpdate();
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String updateEmployDao(Employ employ) throws SQLException {
		Optional<Employ> employFound = Optional.ofNullable(searchEmployDao(employ.getEmpno()));
		if (employFound.isPresent()) {
			String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, "
					+ " Basic = ? WHERE Empno = ?";
			psmt = connection.prepareStatement(cmd);
			psmt.setString(1, employ.getName());
			psmt.setString(2, employ.getGender().toString());
			psmt.setString(3, employ.getDept());
			psmt.setString(4, employ.getDesig());
			psmt.setDouble(5, employ.getBasic());
			psmt.setInt(6, employ.getEmpno());
			psmt.executeUpdate();
			return "Employ Record Updated...";
		}
		return "Employ Record Not FOund...";
	}

}
