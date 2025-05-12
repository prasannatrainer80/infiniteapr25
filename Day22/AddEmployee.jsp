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
	<form method="get" action="AddEmployee.jsp">
		<center>
			First Name : 
			<input type="text" name="firstName" /> <br/><br/>
			Last Name : 
			<input type="text" name="lastName" /> <br/><br/> 
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Email : 
			<input type="email" name="email" /> <br/><Br/>
			<input type="submit" value="Add Employee" />
		</center>
	</form>
	<jsp:useBean id="beanEmployeeDao" class="com.java.hib.dao.EmployeeDaoImpl" />
	<jsp:useBean id="beanEmployee" class="com.java.hib.model.Employee" />
	<jsp:setProperty property="*" name="beanEmployee"/>
	<c:if test="${param.firstName !=null && param.lastName !=null && 
		param.userName !=null && param.email !=null
	 }">
	 	<c:out value="${beanEmployeeDao.addEmployeeDao(beanEmployee)}" />
	 </c:if>
</body>
</html>