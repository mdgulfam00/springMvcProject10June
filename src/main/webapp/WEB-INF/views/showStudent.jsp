<%--
  Created by IntelliJ IDEA.
  User: mdgulfam
  Date: 07/03/25
  Time: 12:01 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Show Students</title>
</head>
<body>
<h1>List Of Students</h1>
    <c:forEach var="item" items="${student}">
        <hr>
        <h2>Student Name:${item.username}</h2>
        <h2>Student Email:${item.email}</h2>
        <h2>Student Password:${item.password}</h2>
    </c:forEach>
</body>
</html>
