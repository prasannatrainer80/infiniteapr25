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
<jsp:useBean id="libraryDao" class="com.java.lib.dao.LibraryDaoImpl" />
<%
	String userName = (String)session.getAttribute("user");
	List<TranBook> booksList = libraryDao.accountDetails(userName);
%>
<jsp:include page="Menu.jsp"/>
<form action="ReturnNext.jsp">
<table border="3">
	<tr>
		<th>Book Id</th>
		<th>User Name</th>
		<th>Issued On</th>
		<th>Return</th>
	</tr>
<%
	for(TranBook tbook : booksList) {
%>
	<tr>
		<td><%=tbook.getBookId() %> </td>
		<td><%=tbook.getUserName() %> </td>
		<td><%=tbook.getFromDate() %> </td>
		<td> 
			<input type="checkbox" name="bookId" value=<%=tbook.getBookId() %> >
		</td>
	</tr>
<%
	}
%>
</table>
<input type="submit" value="Return Book(s)" />
</form>

</body>
</html>