<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="B.jsp"%>
   <%
   		int num1 = Integer.parseInt(request.getParameter("fnum"));
  		int num2 = Integer.parseInt(request.getParameter("snum"));
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A</title>
</head>
<body>
	<h1>
		<%= num1/num2 %>
	</h1>
</body>
</html>