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
	<form action="name.jsp">
		<center>
			Student Name : 
			<input type="text" name="sname" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.sname!=null}">
		<c:set var="sname" value="${param.sname}" />
		Student Name : <b> 
			<c:out value="${sname}" />
		 </b>
	</c:if>
</body>
</html>