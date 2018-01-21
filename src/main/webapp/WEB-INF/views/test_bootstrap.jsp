<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<spring:url value='/bootstrap/css/bootstrap.css'/>"
	type="text/css" rel="stylesheet" />

</head>
<body>
	<div class="container">
		<form:form action="test" modelAttribute="customer">

			<div class="form-group row">
				<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
				<div class="col-sm-4">
					<form:input type="email" path="email" class="form-control" id="inputEmail3"
						placeholder="Email"/>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
				<div class="col-sm-4">
					<form:password path="pass" class="form-control"
						id="inputPassword3" placeholder="Password"/>
				</div>
			</div>

			<div class="form-group row">
				<div class="offset-sm-2 col-sm-10">
					<button type="submit" name="btn" value="Login"
						class="btn btn-success">Sign In</button>
				</div>
				<div class="offset-sm-2 col-sm-10">
					<button type="submit" name="btn" value="Register"
						class="btn btn-success">Sign Up</button>
				</div>
			</div>
		</form:form>
	</div>

	<!-- jQuery 1.9 -->
	<%--Bootstrap JS --%>
	<script src="<spring:url value='/js/jquery.1.9.1.min.js'/>"></script>
	<script src="<spring:url value='/bootstrap/js/bootstrap.min.js'/>"></script>
</body>
</html>