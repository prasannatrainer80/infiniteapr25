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
	<form method="post" action="GeneratePassword.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Otp : 
			<input type="number" name="otp" /> <br/><br/>
			<input type="submit" value="Generate Otp" />
		</center>
	</form>
	<c:if test="${param.otp != null}">
		<jsp:useBean id="beanEmployeeDao" class="com.java.hib.dao.EmployeeDaoImpl" />
		<c:out value="${beanEmployeeDao.generatePassword(param.userName,param.otp)}" />
	</c:if>
</body>
</html>