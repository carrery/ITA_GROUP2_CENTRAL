<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p> 1. Hello World </p>
	<% System.out.println("Your IP Address is: " + request.getRemoteAddr()); %>
	<% System.out.println("Your host name is: "+ request.getServerName()); %>
	<!--System.out.println("Session Id: " + request.getServletContext());-->
	<%@page import = "java.util.*" session="true"%>
	<% 
        Integer counter = (Integer)session.getAttribute("counter");
        if (counter == null) {
            counter = new Integer(1);
        } else {
            counter = new Integer(counter.intValue() + 1);
        }
        session.setAttribute("counter", counter);
        %>
        <% System.out.println("Session ID: " + session.getId());%> 
        <% System.out.println("Number of times in the page: " + counter);%>
	<p> 2. Multiple of two </p>
		<%
		for(int i=1; i<=10 ; i++) {
			int mul = 2 * i;
			System.out.println("Multiple: " + mul);
			out.println(mul);
		}
		%>
	<p> 3. Error Message </p>
		<% Vector vec = new Vector();
			vec = null;
			try {
				if(vec.isEmpty()){
					System.out.println(vec.size());
					out.print(vec.size());
				}
			} catch (Exception e) {
				out.print(e.getMessage() + "\n");
				out.print("Exception!");
			}
		%>	
</body>
</html>