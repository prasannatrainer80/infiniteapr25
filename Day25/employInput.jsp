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
     
	<h1>Employ Form</h1>
	<h:form>
		        Employ No : 
        <h:inputText id="empno" required="true" 
        	label="Employ No" value="#{employ.empno}">
        	<f:validateLongRange maximum="100" minimum="1" />
		</h:inputText>
		<br/><br/>
		<h:message for="empno" style="color:red"/> <br/><br/> 
		Employ Name : 
		        <h:inputText id="name" value="#{employ.name}" required="true"
        	label="Employ Name">
       		 <f:validateLength minimum="5" maximum="10" />
		</h:inputText>
		  <h:message for="name" style="color:red"/>
		  <br/>
		
		         Department : 
        <h:selectOneMenu id="dept" value="#{employ.dept}" 
        	required="true" label="Department">
   	<f:selectItem itemValue="Java" itemLabel="Java" />
   	<f:selectItem itemValue="Dotnet" itemLabel="Dotnet" />
   	<f:selectItem itemValue="Angular" itemLabel="Angular" />
</h:selectOneMenu> <br/><br/>
<h:message for="dept" style="color:red" />
		  <br/><br/>
		Designation : 
		<h:selectOneMenu id="desig" value="#{employ.desig}"
			 required="true" label="Designation">
   	<f:selectItem itemValue="Programmer" itemLabel="Programmer" />
   	<f:selectItem itemValue="Manager" itemLabel="Manager" />
   	<f:selectItem itemValue="TeamLead" itemLabel="Team Lead" />
</h:selectOneMenu>
<h:message for="desig" style="color:red" />
<br/><br/>
        Basic : 
        <h:inputText id="basic" value="#{employ.basic}" 
        		required="true" 
        		label="Basic">
        <f:validateDoubleRange minimum="1000.0" maximum="50000.00" />
        </h:inputText>
          <h:message for="basic" style="color:red" />
		<h:commandButton value="Show" action="employShow"/>
	</h:form>
    </body>
</html>
</f:view>
