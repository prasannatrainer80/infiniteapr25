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
	<table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
		<%
			EmployDaoImpl impl = new EmployDaoImpl();
			List<Employ> employList = impl.showEmployDao();
			for(Employ employ : employList) {
		%>
			<tr>
				<td><%=employ.getEmpno() %> </td>
				<td><%=employ.getName() %> </td>
				<td><%=employ.getGender() %> </td>
				<td><%=employ.getDept() %> </td>
				<td><%=employ.getDesig() %> </td>
				<td><%=employ.getBasic() %> </td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>