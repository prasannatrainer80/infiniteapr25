<%@page import="com.java.lib.model.Books"%>
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
		String searchType = request.getParameter("searchtype");
		String searchValue = request.getParameter("searchvalue");
		List<Books> booksList = libraryDao.searchBooks(searchType, searchValue);
	%>
	<table border="3" align="center">
	<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Author</th>
			<th>Edition</th>
			<th>Department</th>
			<th>Total Books</th>
			<th>Select</th>
		</tr>
		<%
			for(Books book : booksList) {
		%>
			<tr>
				<td> <%=book.getId() %> </td>
				<td> <%=book.getName() %> </td>
				<td><%=book.getEdition() %>  </td>
				<td> <%=book.getAuthor() %>  </td>
				<td> <%=book.getDept() %> </td>
				<td> <%=book.getNoOfBooks() %> </td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>