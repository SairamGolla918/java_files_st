<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login jsp</title>
</head>
<body>
	<form action="" method="post">
		<table align=center width=50% border=1>
			<tr>
				<th>Username</th>
				<td><input type=text name=uname></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type=password name=pword></td>
			</tr>
			<tr>
				<td><input type=submit value=SignIn></td>
				<td><input type=reset value=Cancel></td>
			</tr>
		</table>
	</form>
</body>
</html>