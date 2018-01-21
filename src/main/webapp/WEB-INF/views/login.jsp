<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

	<form action='user.jsp' method='post'>
<input type=hidden name='action' value='login'>
<table>
<tr><td>User Name:<td><input name='userName'>
<tr><td>Password:<td><input name='password' type='password'>
<tr><td><input type=submit value='Login'>
</table>
</form>
</body>
</html>