package com.java.hexa;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.java.hexa.dao.EmployDao;
import com.java.hexa.dao.EmployDaoImpl;

public class EmployDaoTest {
	
	private EmployDao employDaoMock;
	
	@Before
	public void setUp() {
		employDaoMock = new EmployDaoImpl();
	}
	
	@Test
	public void testShowEmployDao() throws SQLException {
		assertEquals(9, employDaoMock.showEmployDao().size());
	}
}
