<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Example of JSP Implicit Object</title>
<%@ page import="java.util.Date"%>
</head>
<body bgcolor=#ffffff> <font color="Black"> 
	
	
	<% 
	
	
		java.util.Vector v = null;
		
		try{
		v.size();
		}
		catch(Exception e)
		{
			javax.swing.JOptionPane.showMessageDialog(null, e.toString(), "InfoBox: " + "Error Happened", javax.swing.JOptionPane.INFORMATION_MESSAGE);
		}
		
	
	%>  

<!-- write a program to display an error message to the user if an exception occurs in the JSP page. In the JSP Page, consider a null vector and find out the length 
of the string using size() method of Java. Create an error handler to handle the exception by this JSP page  -->


		</h3>
</body>
</html>