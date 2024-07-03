<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ page  import="com.spring.mvc.entities.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<h3>${user.getName()}</h3>
<h3>${user.getEmail()}</h3>
<h3>${user.getPass()}</h3>
<h3>${user.getCbox()}</h3>

</div>

</body>
</html>