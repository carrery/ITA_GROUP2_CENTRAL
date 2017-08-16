<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Exercise 1</h1>
	<p>
		<%="Hello world"%>
	</p>
	
	<h1>Exercise 2</h1>
	<p>
		<%="Your host name is " + request.getRemoteHost()%>
	</p>
	<p>
		<%="Your session id is " + session.getId()%>
	</p>


	<h1>Exercise 3</h1>
	<% for (int i = 2; i <= 20; i+=2){ %>
	<%= i %>
	&nbsp;
	<% } %>

	<h1>Exercise 4</h1>
	<% Vector vector = null; try{ %>
	<%= vector.size() %>
	<% } catch(NullPointerException e) {%>
	Look at alert
	<script>window.alert("<%=e%>")</script>
	<%}%>
	
</body>
</html>