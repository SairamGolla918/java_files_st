<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
   
   <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books By Category</title>
</head>
<body>
	<table border=1 align="center"> 
			  <tr>
			  	<th>Title</th>
			  	<th>Author</th>
			  	<th>Publisher</th>
			  	<th>Copies</th>
			  	<th>Category</th>
			  	<th>Buy</th>
			  </tr>
			  <c:forEach   var="bl"    items="${books }">
			     <tr>
			        <td>${bl[0]}</td>
			        <td>${bl[1]}</td>
			        <td>${bl[2]}</td>
			        <td>${bl[3]}</td>
			        <td>${bl[4]}</td>
			        <td> <form action="buyBook" method="post">
                                <input type="hidden" name="title" value="${bl[0]}" />
                                <input type="submit" value="Buy">
                            </form></td>
			     </tr>
			  </c:forEach>
		
		</table>
</body>
</html>