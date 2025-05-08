<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
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
	<c:if test="${param.basic!=null}">
			<sql:setDataSource var="conn"
		driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/infinitepractice"
		user="root"
		password="root"
	/>
		<sql:update var="empUpdate" dataSource="${conn}">
			Insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)
			<sql:param value="${param.empno}" />
			<sql:param value="${param.name}" />
			<sql:param value="${param.gender}" />
			<sql:param value="${param.dept}" />
			<sql:param value="${param.desig}" />
			<sql:param value="${param.basic}" />
		</sql:update>
	<c:out value="Record Inserted..." />
</c:if>
	
</body>
</html>