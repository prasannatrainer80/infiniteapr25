package com.java.hexa;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.java.hexa.dao.EmployDao;
import com.java.hexa.model.Employ;
import com.java.hexa.model.Gender;

public class EmployDaoMockTest {

	@Mock
	private EmployDao employDaoMock;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAddEmployDao() throws SQLException {
		 Employ e2 =  new Employ(102, "Raj", Gender.MALE,"Java", "Prgrammer", 84234);
		 when(employDaoMock.addEmployDao(e2)).thenReturn("Employ Record Inserted...");
		 assertEquals("Employ Record Inserted...", employDaoMock.addEmployDao(e2));
	}

	@Test 
	public void testSearchEmployDao() throws SQLException {
		Employ e1 =   new Employ(1, "Raj", Gender.MALE,"Java", "Prgrammer", 84234);
		Employ e2 =  new Employ(2, "Balaji", Gender.MALE,"Java", "Prgrammer", 84234);
		Employ e3 = null;
		when(employDaoMock.searchEmployDao(1)).thenReturn(e1);
		when(employDaoMock.searchEmployDao(2)).thenReturn(e2);
		when(employDaoMock.searchEmployDao(-1)).thenReturn(e3);
		assertEquals(e1, employDaoMock.searchEmployDao(1));
		assertEquals(e2, employDaoMock.searchEmployDao(2));
		assertNull(employDaoMock.searchEmployDao(-1));
	}
	
	@Test 
	public void testShowEmployDao() throws SQLException {
		  List<Employ> employList = Arrays.asList(
				  new Employ(1, "Raj", Gender.MALE,"Java", "Prgrammer", 84234),
				  new Employ(2, "Balaji", Gender.MALE,"Java", "Prgrammer", 84234),
				  new Employ(3, "Jahnavi", Gender.FEMALE,"Java", "Prgrammer", 84234)
				  );
		  when(employDaoMock.showEmployDao()).thenReturn(employList);
		  assertEquals(3, employDaoMock.showEmployDao().size());
	}
}
