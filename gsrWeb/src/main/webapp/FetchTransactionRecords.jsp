
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
	import="com.gsr.bean.Purchases,com.gsr.jsp.dao.UsersDao,java.util.ArrayList"%>
	
	
	<%
		String username = request.getParameter("username");
	    System.out.println(username);
		ArrayList<Purchases> pList = new UsersDao().getUserTransactions(username);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Records</title>
</head>
<body>
	<table border=1 width=50% aling=center>
		<tr>
			<th>Product Name</th>
			<th>Purchased Date</th>
			<th>Purchased Amount</th>
		</tr>
		<% 
			for(Purchases p :pList)
			{
		%>
			<tr>
			<th><%=p.getProduct_Name() %></th>
			<th><%=p.getPurchase_date() %></th>
			<th><%=p.getAmount() %></th>
			</tr>
		<%
			}
		%>
	</table>


</body>
</html>