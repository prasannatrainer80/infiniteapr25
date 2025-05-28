package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EmployBeanRemote {
	 String addEmployee(Employ employee);
	  List<Employ> showEmployee();
	  Employ searchEmployee(int id);
	  String deleteEmployee(int id);
	  String updateEmployee(Employ employeeNew);
}
