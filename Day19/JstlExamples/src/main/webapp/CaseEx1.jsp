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
	<form method="get" action="CaseEx1.jsp">
	<center>
		Student No : 
		<input type="number" name="sno" /><br/><br/>
		<input type="submit" value="Show" />
	</center>
	<c:if test="${param.sno!=null}">
		<c:set var="sno" value="${param.sno}" />
		<c:choose>
			<c:when test="${sno==1}">
				<c:out value="Hi I am Nirmalya" />
			</c:when>
			<c:when test="${sno==2}">
				<c:out value="Hi I am Sandhan" />
			</c:when>
			<c:when test="${sno==3}">
				<c:out value="Hi I am Sulekha Mishra" />
			</c:when>
			<c:otherwise>
				<c:out value="Invalid value..." />
			</c:otherwise>
		</c:choose>
	</c:if>
</form>
</body>
</html>