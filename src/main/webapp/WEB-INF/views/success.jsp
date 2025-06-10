<%--
  Created by IntelliJ IDEA.
  User: mdgulfam
  Date: 07/03/25
  Time: 11:10 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h1>Welcome:${username}</h1>--%>
<%--<h1>Email Address is:${email}</h1>--%>
<%--<h1>Password is :${password}</h1>--%>

<h1>Using @ModelAttribute</h1>
<h1>Welcome:${user.username}</h1>
<h1>Email Address is:${user.email}</h1>
<h1>Password is :${user.password}</h1>
</body>
</html>
