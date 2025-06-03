package com.java.hexa;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.java.hexa.dao.CustomerDao;
import com.java.hexa.model.Customer;

public class CustomerDaoMockTest {

	@Mock
	private CustomerDao customerDaoMock;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAddCustomerDao() throws SQLException {
		String error1="Customer Name Contains 5 to 10 characters...";
		String error2="Customer City Contains Min 3 characters...";
		String error3="Customer Mobile Contains Min 10 Characters...";
		String success="Customer Record Inserted...";
		Customer c1 = new Customer(1, "ab", "Chennai", "9993339911");
		Customer c2 = new Customer(2, "Prasanna", "AB", "9993339911");
		Customer c3 = new Customer(3, "RajSekhar", "Chennai", "93339911");
		Customer c4 = new Customer(4, "Rishabh", "Delhi", "9993339911");
		when(customerDaoMock.addCustomerDao(c1)).thenReturn(error1);
		when(customerDaoMock.addCustomerDao(c2)).thenReturn(error2);
		when(customerDaoMock.addCustomerDao(c3)).thenReturn(error3);
		when(customerDaoMock.addCustomerDao(c4)).thenReturn(success);
		assertEquals(error1, customerDaoMock.addCustomerDao(c1));
		assertEquals(error2, customerDaoMock.addCustomerDao(c2));
		assertEquals(error3, customerDaoMock.addCustomerDao(c3));
		assertEquals(success, customerDaoMock.addCustomerDao(c4));
	}
}
