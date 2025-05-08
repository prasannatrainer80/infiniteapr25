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
	<form method="get" action="Calc.jsp">
		<center>
			First No : 
			<input type="number" name="firstNo" /> <br/><br/>
			Second No : 
			<input type="number" name="secondNo" /> <br/><br/>
			<input type="submit" value="Calculation" />
		</center>
	</form>
	<c:if test="${param.firstNo !=null && param.secondNo!=null}">
		<jsp:useBean id="beanCalc" class="com.java.jstl.CalcBean" />
		<jsp:setProperty property="*" name="beanCalc"/>
		Sum is : <b>
		<c:out value="${beanCalc.sum()}" /></b> <br/>
		Sub is : <b> 
			<c:out value="${beanCalc.sub()}" />
		</b> <br/>
		Mult is : <b>
			<c:out value="${beanCalc.mult()}" />
		</b>
	</c:if>
</body>
</html>