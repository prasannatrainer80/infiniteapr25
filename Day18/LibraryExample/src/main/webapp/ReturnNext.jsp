<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.jsp"/>
<jsp:useBean id="libraryDao" class="com.java.lib.dao.LibraryDaoImpl" />
<%
	String user = (String)session.getAttribute("user");
	String[] bookList = request.getParameterValues("bookId");
	for(String str : bookList) {
		int id = Integer.parseInt(str);
		out.println(libraryDao.returnBook(user, id));
	}
%>
</body>
</html>