<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: mdgulfam
  Date: 07/03/25
  Time: 12:02 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" pageEncoding="ISO-8859-1"  %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>My Home Page</title>
</head>
<body>
<h1>Hello </h1>
<h1>Page made By Md Gulfam</h1>
<h3>Nice to meet U</h3>

<%
    String name = (String) request.getAttribute("name");
    int id =(int) request.getAttribute("id");
    List<String> al = (List<String>) request.getAttribute("listOfFreinds");
%>


<h2>My name is :<%=name%> </h2>
<h2>My Id is:<%=id%></h2>
<h2>My Freind Lists are:<%=al%></h2>
</body>
</html>
