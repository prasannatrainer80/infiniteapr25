<%@page import="com.java.jdbc.model.Gender"%>
<%@page import="com.java.jdbc.model.Employ"%>
<%@page import="com.java.jdbc.dao.EmployDaoImpl"%>
<%@page import="com.java.jdbc.dao.EmployDao"%>
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
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployDao dao = new EmployDaoImpl();
		Employ employ = dao.searchEmployDao(empno);
	%>
	<form action="UpdateEmploy.jsp">
		Employ No : 
		<input type="number" name="empno" value=<%=employ.getEmpno() %> 
				readonly="readonly" /> <br/><br/>
		Employ Name : 
		<input type="text" name="name" value=<%=employ.getName() %> > <br/><br/>
		Gender : 
		<input type="text" name="gender" value=<%=employ.getGender() %> > <br/><br/> 
		Department : 
		<input type="text" name="dept" value=<%=employ.getDept() %> > <br/><br/>
		Designation : 
		<input type="text" name="desig" value=<%=employ.getDesig() %> > <br/><br/>
		Basic : 
		<input type="number" name="basic" value=<%=employ.getBasic() %> ><br/><br/>
		<input type="submit" value="Update" />
	</form>
	<%
		if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
			Employ employUpd = new Employ();
			employUpd.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employUpd.setName(request.getParameter("name"));
			employUpd.setGender(Gender.valueOf(request.getParameter("gender")));
			employUpd.setDept(request.getParameter("dept"));
			employUpd.setDesig(request.getParameter("desig"));
			employUpd.setBasic(Double.parseDouble(request.getParameter("basic")));
			dao.updateEmployDao(employUpd);
	%>
		<jsp:forward page="EmployShow.jsp" />
	<%
		}
	%>
</body>
</html>