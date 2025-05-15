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
      <jsp:include page="Menu.jsp"/>
        <h:form>
        <center>
                <h2><h:outputText value="Employ Records"/></h2>
            </center>
<h:dataTable value="#{employController.showEmploy()}" var="e" border="3">
    <h:column>
        <f:facet name="header">
            <h:commandLink value="Employ No" action="#{employController.sortBy('empno')}" />
        </f:facet>
        <h:outputText value="#{e.empno}"/>
    </h:column>
    
    <h:column>
        <f:facet name="header">
            <h:commandLink value="Employ Name" action="#{employController.sortBy('name')}" />
        </f:facet>
        <h:outputText value="#{e.name}"/>
    </h:column>

    <h:column>
        <f:facet name="header">
            <h:commandLink value="Gender" action="#{employController.sortBy('gender')}" />
        </f:facet>
        <h:outputText value="#{e.gender}"/>
    </h:column>

    <h:column>
        <f:facet name="header">
            <h:commandLink value="Department" action="#{employController.sortBy('dept')}" />
        </f:facet>
        <h:outputText value="#{e.dept}"/>
    </h:column>

    <h:column>
        <f:facet name="header">
            <h:commandLink value="Designation" action="#{employController.sortBy('desig')}" />
        </f:facet>
        <h:outputText value="#{e.desig}"/>
    </h:column>

    <h:column>
        <f:facet name="header">
            <h:commandLink value="Salary" action="#{employController.sortBy('basic')}" />
        </f:facet>
        <h:outputText value="#{e.basic}"/>
    </h:column>

    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Search Employ" />
        </f:facet>
        <h:commandButton action="#{employController.searchEmploy(e.empno)}" 
            value="Search Employ" />
    </h:column>
</h:dataTable>
        </h:form>
    </body>
</html>
</f:view>