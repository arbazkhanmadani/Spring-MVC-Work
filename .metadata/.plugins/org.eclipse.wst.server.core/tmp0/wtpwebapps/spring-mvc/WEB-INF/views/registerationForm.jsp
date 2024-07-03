<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.spring.mvc.helper.*, java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
</head>
<body>


<h1>Registration Form</h1>

	<form action="registered" method="post">
		<input type="text" name="name" placeholder="Enter your text..."/>
		<input type="email" name="email" placeholder="Enter your email..."/>
		<input type="password" name="pass" placeholder="Enter your password..."/>
		<input type="password" name="conf_pass" placeholder="Enter your password again..."/>
		<input type="checkbox" name="cbox"/>
		<input type="submit" value="register"/>
	</form>

</body>
</html>