<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercise 1</title>
</head>
<body>

<h1>Hello World!</h1>

<p> Hostname: <%= request.getRemoteHost() %></p><br>
<p> Session Id: <%= session.getId() %></p>

</body>
</html>