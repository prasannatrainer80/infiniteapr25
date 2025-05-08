package com.java.lms.dao;

import java.sql.SQLException;

import com.java.lms.model.LeaveDetails;

public interface LeaveDetailsDAO {

	String applyLeave(LeaveDetails leaveDetails) throws ClassNotFoundException, SQLException;
}
