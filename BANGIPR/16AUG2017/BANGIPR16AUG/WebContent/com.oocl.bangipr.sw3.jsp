<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercise 2</title>
</head>
<body>

<h1>The multiples of 2 are: </h1> </br>
<p><% 
for (int counter = 0 ; counter < 10 ; counter++) {
  out.print(2*(2 + counter) + " ");
} %>
</p>
</body>
</html>