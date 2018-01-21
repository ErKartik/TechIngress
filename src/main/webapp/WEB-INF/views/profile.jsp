<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Profile</title>
</head>
<body>
<form action='user.jsp' method='post'>
<input type=hidden name='action' value='updateProfile'>
<table>
<tr><td>Name:<td><input name='name' type="text">
<tr><td>City:<td><input name='city' type="text">
<tr><td>State:<td><input name='state' type="text">
<tr><td>Education:<td><input name='education' type="text">
<tr><td>College Name:<td><input name='colname' type="text">
<tr><td>College City:<td><input name='colcity' type="text">
<tr><td>Interests:<td><input name='name' type="text">
<tr><td>Books Owned:<td><input name='books' type="text">
<tr><td>Projects Done:<td><input name='projects' type="text">
<tr><td>Want to Pursue:<td><input name='pursue' type="text">
<tr><td>Preparing For:<td><input name='prepare' type="text">
<input TYPE=checkbox name=edu VALUE=graduated> Graduated <BR>
<input TYPE=checkbox name=edu VALUE=pursuing> Pursuing <BR>

<tr><td><input type=submit value='Update Profile'>

</table>
</form>
</body>
</html>