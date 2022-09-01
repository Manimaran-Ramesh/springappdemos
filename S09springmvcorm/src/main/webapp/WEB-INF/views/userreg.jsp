<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

	<h2>User Registration</h2>

	<form action="registeruser" method="post">
		<pre>
		Name: <input type="text" name="name" />
		Email: <input type="text" name="email" />
		<input type="submit" name="Register" />
		</pre>
	</form>
	
	<p><%= request.getAttribute("result") %></p>
	<br/>
	<ul>
		<c:forEach var="user" items="${users}">
			<li>${user.id} | ${user.name} | ${user.email}</li>
		</c:forEach>
	</ul>
</body>
</html>	