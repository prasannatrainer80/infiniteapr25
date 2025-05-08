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
	<c:set var="empId" value="${param.empId}" />
	<c:set var="mgrId" value="${param.mgrId}" />
	<c:set var="myInfo" value="${employDao.searchEmployeeDao(param.empId)}" />
	<c:set var="myManagerInfo" value="${employDao.searchEmployeeDao(param.mgrId)}" />
	<table border="3" align="center">
		<tr>
			<th>
				<p>Employee Id :<b>${myInfo.empId} </b> </p>
				<p>Employee Name <b>${myInfo.empName}</b> </p>
				<p>Email <b>${myInfo.empEmail}</b>
				<p>Mobile No : <b>${myInfo.mobileNo }</b> </p>
				<p>Department : <b>${myInfo.dept}</b> </p>
				<p>Date Of Join :<b>${myInfo.dateOfJoin}</b> </p>
				<p>Manager Id : <b>${myInfo.managerId}</b> </p>
				<p>Leave Available Balance <b>${myInfo.leaveAvail} </b> </p>
			</th>
			<th>
				<p>Manager Id : <b>${myManagerInfo.empId} </b> </p>
				<p>Manager Name <b>${myManagerInfo.empName}</b> </p>
				<p>Manager Email <b>${myManagerInfo.empEmail}</b>
				<p>Manager Mobile No : <b>${myManagerInfo.mobileNo }</b> </p>
				<p>Manager Department : <b>${myManagerInfo.dept}</b> </p>
				<p>Manager Date Of Join :<b>${myManagerInfo.dateOfJoin}</b> </p>
				<p>Manager Id : <b>${myManagerInfo.managerId}</b> </p>
				<p>Manager Leave Available Balance <b>${myManagerInfo.leaveAvail} </b> </p>
			</th>
		</tr>
	</table>
</body>
</html>