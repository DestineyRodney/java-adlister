<%--
  Created by IntelliJ IDEA.
  User: destineyrodney
  Date: 12/6/21
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
    <%@include file="partials/head.jsp"%>

</head>
<body>
<h1>What's your favorite color?</h1>
<form action="/pickcolor" method="POST">

    <label for="color">Type your favorite color</label>
    <input type="text" name="color" id="color" placeholder="What is your favorite color.">


    <input type="submit">
</form>

</body>
</html>
