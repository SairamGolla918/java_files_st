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
<form action="submitCategory" method="post" align="center">
    <label for="category">Select a Category:</label>
    <select id="category" name="category">
        <c:forEach var="category" items="${categories}">
            <option value="${category}">${category}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Submit">
</form>


</body>
</html>