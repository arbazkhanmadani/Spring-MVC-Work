<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ page import="java.util.*" %>
<%@ page import="com.spring.mvc.entities.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Student List</h1>
    <table>
        <thead>
            <tr>
                <th>RollNumber</th>
                <th>Name</th>
                <!-- Add more headers as needed -->
            </tr>
        </thead>
        <tbody>
            <!-- Iterate over studentList from Model -->
            <c:forEach items="${studentList}" var="student">
                <tr>
                    <td>${student.getRollNo()}</td>
                    <td>${student.getName()}</td>
                    <!-- Add more columns as needed -->
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>