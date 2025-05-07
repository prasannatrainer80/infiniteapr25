package com.java.lib.dao;

import java.sql.SQLException;

import com.java.lib.model.LibUsers;

public interface LibraryDao {

	String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException;
}
