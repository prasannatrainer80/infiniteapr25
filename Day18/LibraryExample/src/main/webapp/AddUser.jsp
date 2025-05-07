<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="AddUser.jsp">
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passWord" /> <br/><br/>
		Re-Type Password : 
		<input type="password" name="retypePassCode" /> <br/><br/> 
		<input type="submit" value="Create Account" />
	</form>
	<%
		if (request.getParameter("userName")!=null && 
			request.getParameter("passWord")!=null
				) {
			String pwd = request.getParameter("passWord");
			String reType = request.getParameter("retypePassCode");
			if (pwd.equals(reType)) {
	%>
	<jsp:useBean id="libUsers" class="com.java.lib.model.LibUsers" />
	<jsp:useBean id="libDao" class="com.java.lib.dao.LibraryDaoImpl" />
	<jsp:setProperty property="*" name="libUsers"/>
	<%=libDao.createUser(libUsers) %>
	<%
			}
		}
	%>
</body>
</html>