package com.java.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.java.lms.model.Employee;
import com.java.lms.util.ConnectionHelper;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection connection;
	PreparedStatement pst;
	@Override
	public List<Employee> showEmployeeDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		List<Employee> employList = new ArrayList<Employee>();
		while(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("Emp_Name"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setDept(rs.getString("EMP_DEPT"));
			employee.setMobileNo(rs.getString("EMP_MOB_NO"));
			employee.setDateOfJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setManagerId(rs.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
			employList.add(employee);
		}
		return employList;
	}

	@Override
	public Employee searchEmployeeDao(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee where EMP_ID=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		if (rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("Emp_Name"));
			employee.setDept(rs.getString("EMP_DEPT"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setMobileNo(rs.getString("EMP_MOB_NO"));
			employee.setDateOfJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setManagerId(rs.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
		}
		return employee;
	}

}
