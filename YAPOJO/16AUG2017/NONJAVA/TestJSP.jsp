<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%! Vector vector = new Vector();%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Exercises 1, 2 & 3</title>
</head>
<body>
<p> Exercise 1 </p>
<%="Your IP address is " + request.getRemoteAddr() %> 
<br>
<%="Your Session ID is " + request.getSession() %>
<br>
<p> Exercise 2 </p>
<% int prod = 1; %>
<% for (int a = 1; a <= 10; a++) { %>
<% prod =  a*2;%>
<%=prod %>
<%} %>
<p> Exercise 3 </p>
<% vector = null; %>
<% try { %>
<% vector.size();%>
<% } catch (NullPointerException e) { %>
<%=e %>
<%}%>

</body>
</html>