<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercise 3</title>
</head>
<body>


<% java.util.Vector v = new java.util.Vector(); 

v = null;
%>

<p>Check if vector is not empty </p>
</br></br>


<% 
	try {
		out.print(v.size());
	}catch (Exception e){ 
		out.print(e);
		
	}



%>



</body>
</html>