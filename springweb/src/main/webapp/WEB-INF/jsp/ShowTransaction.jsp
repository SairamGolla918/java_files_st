<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
   
   <%@ taglib uri="jakarta.tags.core" prefix="c" %>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transactions</title>
</head>
<body>
		<table border=1 align="center"> 
			  <tr>
			  	<th>Transaction Type</th>
			  	<th>Transaction Date</th>
			  	<th>Amount</th>
			  </tr>
			  <c:forEach   var="tl"    items="${transList }">
			     <tr>
			        <td>${tl[0]}</td>
			        <td>${tl[1]}</td>
			        <td>${tl[2]}</td>
			     </tr>
			  </c:forEach>
		
		</table>

</body>
</html>