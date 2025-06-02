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
	<h:outputLabel value="Created By " />
 <h:inputText id="createdBy" value="#{travelGroup.createdBy}"/>
 <br>	
 <h:outputLabel value="Group Name " /> 
<h:inputText  id="groupName" value="#{travelGroup.groupName}"/>
<br>
 <h:outputLabel value="Start Date " /> 
<h:inputText  id="startDate" value="#{travelGroup.startDate}">
  <f:convertDateTime pattern="yyyy-MM-dd" />
</h:inputText>
<br>
 <h:outputLabel value="End Date " /> 
<h:inputText  id="endDate" value="#{travelGroup.endDate}">
  <f:convertDateTime pattern="yyyy-MM-dd" />
</h:inputText>
<br>
 <h:outputLabel value="Initial Amount " /> 
<h:inputText  id="initialAmount" value="#{travelGroup.initialAmount}"/>
<br>
		<h:commandButton action="#{userDao.addGroup(travelGroup)}" 
		value="Add Group" />
        </h:form>
    </body>
</html>
</f:view>
