package com.java.st;

import java.util.ArrayList;
import java.util.List;

public class EmployDao {
	
	private static List<Employ> employList;
	
	private static EmployDao dao;
	
	public static EmployDao getInstance() {
		if (dao==null) {
			dao = new EmployDao();
		}
		return dao;
	}
	
	private EmployDao() {}
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	public String updateEmployDao(Employ employNew) {
		Employ employFound = searchEmployDao(employNew.getEmpno());
		if (employFound != null) {
			for (Employ employ : employList) {
				if (employ.getEmpno() == employNew.getEmpno()) {
					employ.setName(employNew.getName());
					employ.setGender(employNew.getGender());
					employ.setDept(employNew.getDept());
					employ.setDesig(employNew.getDesig());
					employ.setBasic(employNew.getBasic());
					break;
				}
			}
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}
	
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound!=null) {
			employList.remove(employFound);
			return "Record Deleted...";
		}
		return "Employ Record Not Found...";
	}
	
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		
		for (Employ employ : employList) {
			if (employ.getEmpno()==empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}
	
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ record Inserted...";
	}
	
	public List<Employ> showEmployDao() {
		return employList;
	}
}
