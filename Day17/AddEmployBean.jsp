<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="AddEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/>
			Gender : 
			<select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select> <br/><br/>
			Department : 
			<select name="dept">
				<option value="Java">Java</option>
				<option value="Dotnet">Dotnet</option>
				<option value="Sql">Sql</option>
			</select> <br/><br/>
			Designation : 
			<select name="desig">
				<option value="Developer">Developer</option>
				<option value="TeamLead">TeamLead</option>
				<option value="Manager">Manager</option>
			</select> <br/><br/>
			Salary : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Add Employ" />
		</center>
	</form>
	<%
		if (request.getParameter("empno")!=null && 
			request.getParameter("basic")!=null) {
	%>
	<jsp:useBean id="beanEmploy" class="com.java.jdbc.model.Employ" />
	<jsp:useBean id="beanEmployDao" class="com.java.jdbc.dao.EmployDaoImpl" />
	<jsp:setProperty property="*" name="beanEmploy"/>
	<%=beanEmployDao.addEmployDao(beanEmploy) %>
	<%			
		}
	%>
</body>
</html>