<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EDI WOW!!!</title>
</head>
<body>
<% int x = 2, y = 4; %>

<p> Exercise 1 </p>
<p> <%= "Hello World" %> </p>
<p> <%= "Your Host name is " + request.getRemoteHost() %> </p>
<p> <%= "Your Session id is " + request.getSession() %> </p>
<br>

<p> Exercise 2 </p>
<% int product = 1; %>
<% for (int i = 1; i <= 5; i++) { %>
<% product =  i*2;%>
<%=product %>
<%} %>
<br>

<p> Exercise 3 </p>
<%   Vector v = null;%>
<%  try{ %>
<%= v.size() %>
<% } catch(Exception e){ %>
<%= e %>
<% } %>



</body>
</html>