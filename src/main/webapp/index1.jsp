<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>College Management System</h1>
<h3>Invalid Login</h3>
	<form action="login">
		<label>User name:</label>
		<input type="text" name="username" placeholder="Enter Username" /><br /><br />
		<label>Password:</label>
		<input type="text" name="password" placeholder="Enter Password" /><br /><br />
		<input type="submit" value="Login" /><br /><br />
		<input type="button" onClick="location.href='registration.jsp'" value="Sign in" />
	</form>
</body>
</html>