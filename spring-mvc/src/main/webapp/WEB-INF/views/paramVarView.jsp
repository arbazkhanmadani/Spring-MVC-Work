<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List data = (List)request.getAttribute("list");%>
<h1>Hyyyyyyyyyyyyyyyyyyyyyyyyyyyyy</h1>
<h1><%=data.get(0) %></h1>
<h1>${data.get(1)}</h1>

</body>
</html>