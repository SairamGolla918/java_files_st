<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" session="true" %>
    
<%
	String username = (String)session.getAttribute("username");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>B</title>
</head>
<body>
	<h1><%=username %></h1>
	<h2>
		<%= "Exception Occured" + exception.getMessage() %>
	</h2>
</body>
</html>