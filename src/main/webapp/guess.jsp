<%--
  Created by IntelliJ IDEA.
  User: destineyrodney
  Date: 12/6/21
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Number</title>
    <%@include file="partials/head.jsp"%>
</head>
<body>
<%@ include file="partials/navbar.jsp"%>
<h1>Guess a number</h1>
<form action="guess" method="POST">
    <label for="number">Number</label>
    <input type="text" name="number" id="number" placeholder="Pick a number from 1-3">

    <input type="submit">

</form>

</body>
</html>
