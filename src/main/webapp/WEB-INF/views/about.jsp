<%--
  Created by IntelliJ IDEA.
  User: mdgulfam
  Date: 07/03/25
  Time: 12:06 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>  <%--The above line is compulsory to activate expression language reading by .jsp files--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%--This is used for iteration over each item in list--%>

<html>
<head>
    <title>About Section </title>
</head>
<body>

<h1>About Page is present....</h1>
<h2>Class name is :${year}</h2>
<h2>School Name is :${school} </h2>
<h2>Total fees is : ${fees}</h2>
<h2>Marks of 5 Subjects are :${marks}</h2>

<hr>
<hr>
<h1>Marks after using JSTL library that helps in iterations:</h1>

<c:forEach var="item" items="${marks}">
    <h3>${item}</h3>
</c:forEach>


</body>
</html>
