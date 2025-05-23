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
	<h:outputLabel value="Employ Number " />
 <h:inputText id="empno" value="#{employFound.empno}"/>
          <h:message for="empno" style="color:red" />
 <br>	
 <h:outputLabel value="Employ Name " /> 
<h:inputText  id="name" value="#{employFound.name}"/>
     <h:message for="name" style="color:red" />
<br>
 <h:outputLabel value="Gender " /> 
<h:inputText  id="gender" value="#{employFound.gender}"/><br>
 <h:outputLabel value="Department " /> 
<h:inputText  id="dept" value="#{employFound.dept}"/><br>
 <h:outputLabel value="Designation " /> 
<h:inputText  id="desig" value="#{employFound.desig}"/><br>
 <h:outputLabel value="Basic " /> 
<h:inputText  id="basic" value="#{employFound.basic}"/>
     <h:message for="basic" style="color:red" />
<br>
	<h:commandButton action="#{ejbImpl.updateEmployEjb()}" 
		value="Update Employ" />
        </h:form>
    </body>
</html>
</f:view>
