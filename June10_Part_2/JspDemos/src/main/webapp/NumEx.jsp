<%@ page language="java" errorPage="Error.jsp" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="NumEx.jsp">
		<center>
			Enter a Number : 
			<input type="text" name="sno" /> <br/><Br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<%
		if (request.getParameter("sno") != null) {
			int sno = Integer.parseInt(request.getParameter("sno"));
			out.println(sno);
		}
	%>
</body>
</html>