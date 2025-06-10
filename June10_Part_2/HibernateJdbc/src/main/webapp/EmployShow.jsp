<%@page import="com.java.hib.model.Employ"%>
<%@page import="java.util.List"%>
<%@page import="com.java.hib.dao.EmployDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		EmployDaoImpl impl = new EmployDaoImpl();
		List<Employ> employList = impl.showEmployDao();
		for(Employ employ : employList) {
			out.println("Employ No  " +employ.getEmpno() + "<br/>");
			out.println("Employ Name " +employ.getName() + "<br/>");
			out.println("Gender  " +employ.getGender() + "<br/>");
			out.println("Department  " +employ.getDept() + "<br/>");
			out.println("Designation  " +employ.getDesig() + "<br/>");
			out.println("Basic  " +employ.getBasic() + "<br/><hr/>");
		}
	%>
</body>
</html>