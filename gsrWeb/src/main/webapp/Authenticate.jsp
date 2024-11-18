<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
	import="com.gsr.bean.Users,com.gsr.jsp.dao.UsersDao" session="true" %>

<%
	String message = "Invalid Username / Password";
	String username = request.getParameter("uname");
	String password = request.getParameter("pward");
	Users u = new Users(username, password);
	
	
	if(new UsersDao().authenticateUser(u))
	{
		message = "welcome to the website";
		session.setAttribute("username",username);
%>
		<jsp:forward page="FetchTransactionRecords.jsp">
			<jsp:param  name="username" value="<%=username%>" />
		</jsp:forward>

<% 
	}
	else
	{
		
%>
		<jsp:include page = "login.html"></jsp:include>
<%
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1 style="text-align:center;color:red">
		<%= message%>
	</h1>

</body>
</html>