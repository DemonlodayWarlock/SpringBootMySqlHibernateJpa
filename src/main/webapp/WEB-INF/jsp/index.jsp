<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!--Include error page  -->   
<%@page errorPage="error.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Spring boot local test</title>
</head>
<body>
	This is index page!
	<br/>
	<br/>
	<% Date newDate = new Date(); %>
	<% out.println("This is new date:"+newDate); %>
	<br/>
	<br/>
	This is date:<%=newDate %>
	<br/>
	<br/>
	
	<%-- <%= 0/0 %> --%>
	

	<form action="/view/{circle}" method="post" >
		Circle Name:<input type="text" name="name" required="required"/>
		<br/>
		<input type="reset" name="Reset">
		<input type="submit" name="Submit"/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href="/view/circles"> All Circles</a>
	
</body>
</html>