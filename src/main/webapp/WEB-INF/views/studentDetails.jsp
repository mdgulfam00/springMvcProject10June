<%--
  Created by IntelliJ IDEA.
  User: mdgulfam
  Date: 07/03/25
  Time: 11:41 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <title>Student Registration</title>
</head>
<body>
<div class="container mt-5">
  <h2 class="text-center">Registration Form</h2>
  <form action="addstudent" method="post">
    <div class="form-group">
      <label for="exampleInputEmail1">Email address</label>
      <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="userName">User Name</label>
      <input type="text" class="form-control" id="userName" name="username" aria-describedby="emailHelp" placeholder="Enter here">
    </div>

    <div class="form-group">
      <label for="password">Password</label>
      <input type="password" class="form-control" id="password" name="password" aria-describedby="emailHelp" placeholder="Enter here">
    </div>

    <div class="container text-center">
      <button type="submit" class="btn btn-success">Sign Up</button>
    </div>

  </form>
</div>
</body>
</html>
