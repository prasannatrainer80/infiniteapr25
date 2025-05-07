<%@page import="com.java.lib.model.TranBook"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Menu.jsp" />
	<jsp:useBean id="libraryDao" class="com.java.lib.dao.LibraryDaoImpl" />
	<%
		String user = (String)session.getAttribute("user");
		List<TranBook> booksIssued = libraryDao.accountDetails(user);
	%>
	<table border="3" align="center">
		<tr>
			<th>Book Id</th>
			<th>UserName</th>
			<th>From Date</th>
		</tr>
		<%
			for(TranBook tbook : booksIssued) {
		%>
			<tr>
				<td><%=tbook.getBookId() %>  </td>
				<td><%=tbook.getUserName() %> </td>
				<td><%=tbook.getFromDate() %> </td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>