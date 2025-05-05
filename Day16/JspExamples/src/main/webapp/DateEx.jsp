<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date date = new Date();
	%>
	Time is : <b>
		<%=date.getHours() %> : <%=date.getMinutes() %> : <%=date.getSeconds() %>
	</b>
</body>
</html>