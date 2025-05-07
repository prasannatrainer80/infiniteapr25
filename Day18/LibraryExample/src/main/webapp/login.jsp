<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="login.jsp">
<center>
<h2>Please Login :</h2>
Username : <input type="text" name="userName" size="50"> <br/><br/>
Password : <input type="password" name="passWord" size="50"> <br/><br/>
<input type="submit" value="Login">
</center>
</form>
<%
	if (request.getParameter("userName")!=null && 
		request.getParameter("passWord")!=null) {
		String user = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
%>
	<jsp:useBean id="libUsers" class="com.java.lib.model.LibUsers" />
	<jsp:setProperty property="*" name="libUsers"/>
	<jsp:useBean id="libraryDao" class="com.java.lib.dao.LibraryDaoImpl" />
	
<%
	int count = libraryDao.login(libUsers);
	if (count==1) {
		session.setAttribute("user", request.getParameter("userName"));
%>
	<jsp:forward page="Menu.jsp" />
<%
	} else {
		out.println("Invalid Credentials...");
	}
	}
%>
</body>
</html>