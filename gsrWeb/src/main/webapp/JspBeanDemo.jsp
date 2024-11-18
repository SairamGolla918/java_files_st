<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bean Demo</title>
</head>
<body>
	<jsp:useBean id="prod1" class="com.gsr.bean.Product" scope="application">
		<jsp:setProperty name="prod1" property="*"/>
	</jsp:useBean>
	<jsp:forward page="JspBeanDemo2.jsp" />
</body>
</html>