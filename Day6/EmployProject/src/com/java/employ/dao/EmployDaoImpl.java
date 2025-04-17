package com.java.employ.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.employ.model.Employ;

public class EmployDaoImpl implements EmployDao {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	@Override
	public List<Employ> showEmployDao() {
		return employList;
	}

	@Override
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}

	@Override
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno() == empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound != null) {
			employList.remove(employFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String updateEmployDao(Employ employUpdate) {
		Employ employFound = searchEmployDao(employUpdate.getEmpno());
		if (employFound !=null) {
			employFound.setName(employUpdate.getName());
			employFound.setGender(employUpdate.getGender());
			employFound.setDept(employUpdate.getDept());
			employFound.setDesig(employUpdate.getDesig());
			employFound.setBasic(employUpdate.getBasic());
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}

}
