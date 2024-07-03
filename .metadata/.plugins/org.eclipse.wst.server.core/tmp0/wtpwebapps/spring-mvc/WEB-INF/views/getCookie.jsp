<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Cookie[] ck =  request.getCookies(); %>

<%= ck[0].getName() %><br/>
<%= ck[0].getValue() %><br/>
<%= ck[0].getMaxAge() %><br/>
<%= ck[0].getDomain() %><br/>
<%= ck[0].getSecure() %>


</body>
</html>