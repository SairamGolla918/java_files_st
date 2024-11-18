<%@page import="com.fos.dto.FoodCategory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="com.fos.dto.Menu,com.fos.dao.MenuDao,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Table</title>
</head>
<body>
		
	<table border=1 width=50% aling=center>
		 <tr>
			<th>Item Id</th>
			<th>Item Name</th>
			<th>Price</th>
			<th>Rest Id</th>
			<th>Cat Id</th>
		</tr>
		<% 
			for(Menu m :new MenuDao().Check())
			{
		%> 
			<tr>
			<th><%=m.getItemId() %></th>
			<th><%=m.getItemName() %></th>
			<th><%=m.getPrice() %></th>
			<th><%=m.getRestaurantId() %></th>
			<th><%=m.getCategoryId() %></th>
			</tr>
		<%
			}
		%>  
		<%-- <tr>
			<th>Category Id</th>
			<th>Category Name</th>
		</tr> 
		<%
			for(FoodCategory f :new MenuDao().Check())
			{
		%>
			<tr>
			<th><%=f.getCategoryId() %></th>
			<th><%=f.getCategoryName() %></th>
			</tr>
		<%
			}
		%>  --%>
	</table>

</body>
</html>