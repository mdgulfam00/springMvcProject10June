<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: mdgulfam
  Date: 25/02/25
  Time: 11:21 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Help Center</title>
</head>
<body>
<h1>This is help Page of our application...</h1>
<h2>Thank you Gulfam Khan for this application....</h2>
<%
  String name =(String) request.getAttribute("name");
  String address = (String) request.getAttribute("address");
  LocalDateTime time = (LocalDateTime) request.getAttribute("loggedInTime");
%>

<h1 >Name:<%=name%></h1>
<h1>Adress:<%=address%></h1>
<h1>You have logged in at :<%=time%></h1>

</body>
</html>
