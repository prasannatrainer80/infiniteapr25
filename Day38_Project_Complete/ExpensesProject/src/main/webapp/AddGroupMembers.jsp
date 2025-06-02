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
	<h:outputLabel value="Group Id " />
 <h:inputText id="groupId" value="#{groupMembers.groupId}"/>
 <br>	
 <h:outputLabel value="User Id " /> 
<h:inputText  id="userId" value="#{groupMembers.userId}"/>
<br>
 <h:outputLabel value="Amount Collected " /> 
<h:inputText  id="amountCollected" value="#{groupMembers.amountCollected}"/>
<br>

	<h:commandButton action="#{userDao.addGroupMembers(groupMembers)}" 
		value="Add Members" />
        </h:form>
    </body>
</html>
</f:view>
