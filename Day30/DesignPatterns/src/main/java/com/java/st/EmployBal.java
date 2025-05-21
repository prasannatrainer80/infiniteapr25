package com.java.st;

import java.util.List;

public class EmployBal {

	static StringBuilder sb = new StringBuilder();
	private static EmployDao dao;
	private static EmployBal bal;
	
	public static EmployBal getInstance() {
		if (bal==null) {
			bal = new EmployBal(); 
		}
		return bal;
	}
	private EmployBal() {}
	
//	public static EmployDAO getInstanceDao() {
//		if (dao==null) {
//			dao = new EmployDAO();
//		}
//		return dao;
//	}
	public String updateEmployBal(Employ employNew) throws EmployException {
		dao = EmployDao.getInstance();
		if (isValid(employNew)==true) {
			return dao.updateEmployDao(employNew);
		}
		return "";
	}
	public String deleteEmployBal(int empno) {
		dao = EmployDao.getInstance();
		return dao.deleteEmployDao(empno);
	}
	public Employ searchEmployBal(int empno) {
		dao = EmployDao.getInstance();
		return dao.searchEmployDao(empno);
	}
	
	public List<Employ> showEmployBal() {
		dao = EmployDao.getInstance();
		return dao.showEmployDao();
	}
	public String addEmployBal(Employ employ) throws EmployException {
		dao = EmployDao.getInstance();
		if (isValid(employ)==true) {
			return dao.addEmployDao(employ);
		}
		return "";
	}
	public boolean isValid(Employ employ) throws EmployException {
		boolean flag=true;
		if (employ.getEmpno() <= 0) {
			sb.append("Employ No Cannot be Zero or Negative...\r\n");
			flag = false;
		}
		if (employ.getName().length() < 5) {
			sb.append("Name Contains min. 5 characters...\r\n");
			flag = false;
		}
		if (employ.getDept().length() < 3) {
			sb.append("Department Contains min. 3 characters...\r\n");
			flag = false;
		}
		if (employ.getDesig().length() < 4) {
			sb.append("Designation Contains min. 4 characters...\r\n");
			flag = false;
		}
		if (employ.getBasic() < 20000 || employ.getBasic() > 90000) {
			sb.append("Basic Must be Between 20000 and 90000...\r\n");
			flag=false;
		}
		if (flag==false) {
			throw new EmployException(sb.toString());
		}
		return flag;
	}
}
