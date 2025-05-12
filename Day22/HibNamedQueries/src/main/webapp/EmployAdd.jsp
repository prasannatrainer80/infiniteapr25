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
<form method="get" action="EmployAdd.jsp">
	<center>
		Employ No : 
		<input type="number" name="empno" value=${employ.empno} >
		<br/><br/>
		Employ Name : 
		<input type="text" name="name" value=${employ.name} > <br/><br/>
		Gender : 
		<input type="text" name="gender" value=${employ.gender} > <br/><br/>
		Department  :
		<input type="text" name="dept" value=${employ.dept} > <br/><br/>
		Designation : 
		<input type="text" name="desig" value=${employ.desig} > <br/><br/>
		Basic :
		<input type="number" name="basic" value=${employ.basic} > <br/><br/>
		<input type="submit" value="Add Employ" />
	</center>
	</form>
	<jsp:useBean id="employDao" class="com.java.hib.dao.EmployDaoImpl" />
	<jsp:useBean id="employ" class="com.java.hib.model.Employ" />
	<c:if test="${param.empno !=null && param.basic != null}">
	<jsp:setProperty property="*" name="employ"/>
	<c:out value="${employDao.addEmployDao(employ)}"/>
	<jsp:forward page="EmployShow.jsp" />
	</c:if>
</body>
</html>