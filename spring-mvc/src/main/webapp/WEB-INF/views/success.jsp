<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="com.spring.mvc.entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>

</head>
<body>

<% User user = (User)request.getAttribute("user");%>

<div>
	<h4>${user.getEmail()}</h4>
	<h4>${user.getPass()}</h4>
	
</div>

</body>
</html>