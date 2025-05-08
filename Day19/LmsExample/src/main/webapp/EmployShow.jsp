<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="employDao" class="com.java.lms.dao.EmployeeDAOImpl" />
	<c:set var="employList" value="${employDao.showEmployeeDao()}" />
	<table border="3" align="center">
		<tr>
			<th>Employ Id</th>
			<th>Employee Name</th>
			<th>Employee Email</th>
			<th>Mobile No</th>
			<th>Date of Join</th>
			<th>Department</th>
			<th>Manager Id</th>
			<th>Employee Available Balance</th>
			<th>ShowInfo</th>
		</tr>
		<c:forEach var="employ" items="${employList}">
			<tr>
				<td>${employ.empId}</td>
				<td>${employ.empName}</td>
				<td>${employ.empEmail}</td>
				<td>${employ.mobileNo}</td>
				<td>${employ.dateOfJoin}</td>
				<td>${employ.dept}</td>
				<td>${employ.managerId}</td>
				<td>${employ.leaveAvail}</td>
				<td>
					<a href=DashBoard.jsp?empId=${employ.empId}&mgrId=${employ.managerId}>Show Info</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html> 