package com.java.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.lib.model.LibUsers;
import com.java.lib.util.ConnectionHelper;
import com.java.lib.util.EncryptPassword;

public class LibraryDaoImpl implements LibraryDao {

	Connection connection;
	PreparedStatement psmt;
	
	@Override
	public String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException {
		String encr = EncryptPassword.getCode(libUsers.getPassWord());
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into LibUsers(UserName,Password) values(?,?)";
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, libUsers.getUserName());
		psmt.setString(2, encr);
		psmt.executeUpdate();
		return "User Account Created Successfully...";
	}

	@Override
	public int login(LibUsers libUsers) throws ClassNotFoundException, SQLException {
		String encr = EncryptPassword.getCode(libUsers.getPassWord());
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from LibUsers where UserName = ? AND "
				+ " Password = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, libUsers.getUserName());
		psmt.setString(2, encr);
		ResultSet rs = psmt.executeQuery();
		rs.next();
		int count= rs.getInt("cnt");
		return count;
	}

}
