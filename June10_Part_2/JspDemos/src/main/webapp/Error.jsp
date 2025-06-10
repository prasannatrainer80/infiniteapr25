<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan" text="red">
	<p>There is an Error Occurred In Your Code </p>
	
	<p> Exception Class <b> <%=exception.getClass() %></b>
	<p> Error Message <b> <%=exception.getMessage() %>  </b>
	<p> Error Cause <b> <%=exception.getCause() %> </b>
	</p>
</body>
</html>