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
 <h:inputText id="groupId" value="#{dailyExpenses.groupId}"/>
 <br>	
 <h:outputLabel value="Expense Date " /> 
<h:inputText  id="expenseDate" value="#{dailyExpenses.expenseDate}">
  <f:convertDateTime pattern="yyyy-MM-dd" />
</h:inputText>
<br>
	<h:outputLabel value="Expense Description " />
 <h:inputText id="expenseDescription" value="#{dailyExpenses.expenseDescription}"/>
 <br>	
 <h:outputLabel value="PaidBy " /> 
<h:inputText  id="paidBy" value="#{dailyExpenses.paidBy}" />
<br> 
 <h:outputLabel value="Amount " /> 
<h:inputText  id="amount" value="#{dailyExpenses.amount}"/>
<br>
		<h:commandButton action="#{userDao.addDailyExpenses(dailyExpenses)}" 
		value="Add Group" />
        </h:form>
    </body>
</html>
</f:view>
