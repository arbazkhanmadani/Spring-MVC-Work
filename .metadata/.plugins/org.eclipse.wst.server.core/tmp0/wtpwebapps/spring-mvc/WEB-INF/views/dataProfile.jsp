<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" import="com.spring.mvc.entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>${person.getEmail()}</h1>
<h1>${person.getAddr1()}</h1>
<h1>${person.getAddr2()}</h1>
<h1>${person.getCity()}</h1>
<h1>${person.getState()}</h1>
<h1>${person.getCheck()}</h1>
<h1>${person.getDate()}</h1>
<h1>${person.getCollege().getCollegeName()}</h1>

</body>
</html>