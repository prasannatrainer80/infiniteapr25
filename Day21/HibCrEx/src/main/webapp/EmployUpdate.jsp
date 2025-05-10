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
	<c:set var="empno" value="${param.empno}" />
	<jsp:useBean id="employDao" class="com.java.hib.dao.EmployDaoImpl" />
	<c:set var="employ" value="${employDao.searchEmployDao(empno)}" />
	<form method="get" action="EmployUpdate.jsp">
	<center>
		Employ No : 
		<input type="number" name="empno" readonly="readonly" value=${employ.empno} />
		<br/><br/>
		Employ Name : 
		<input type="text" name="name" value=${employ.name} /> <br/><br/>
		Gender : 
		<input type="text" name="gender" value=${employ.gender} /> <br/><br/>
		Department  :
		<input type="text" name="dept" value=${employ.dept} /> <br/><br/>
		Designation : 
		<input type="text" name="desig" value=${employ.desig} /> <br/><br/>
		Basic :
		<input type="number" name="basic" value=${employ.basic} /> <br/><br/>
		<input type="submit" value="Update Employ" />
	</center>
	</form>
	<c:if test="${param.empno !=null && param.basic !=null}">
		<jsp:useBean id="employ" class="com.java.hib.model.Employ" />
		<jsp:setProperty property="*" name="employ"/>
		<c:out value="${employDao.updateEmployDao(employ)}" />
		<jsp:forward page="EmployShow.jsp" />
	</c:if>
</body>
</html> 