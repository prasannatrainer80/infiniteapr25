<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h:form prependId="false">
	<h:outputLabel value="User Name " />
 <h:inputText id="userName" value="#{users.userName}"/>
 <br>	
 <h:outputLabel value="User Email " /> 
<h:inputText  id="email" value="#{users.email}"/>
     <h:message for="name" style="color:red" />
<br>
	<h:commandButton action="#{userDao.addUserDao(users)}" 
		value="Add Users" />
        </h:form>
    </body>
</html>
</f:view>
