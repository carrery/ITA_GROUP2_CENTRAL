<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<br> Multiples of 2 are the following :
<ol>
	<%
			for (int i = 1; i < 51; i++) {
	%>
	<li>
		<%
			out.println(i*2);
				}
		%>
	
</ol>

</html>