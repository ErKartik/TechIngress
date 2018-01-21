<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<spring:url value='/css/main.css'/>"
	type="text/css" />
</head>
<body>
	<h3 align="center">Testing Video</h3>
	<video width="320" height="240" autoplay>
		<source
			src="<spring:url value='/upload_images/${requestScope.img_name}'/>"
			type="video/mp4">
	</video>
	<a href="<spring:url value='/'/>">Back To Index Page</a>
</body>
</html>