<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 26/10/2022
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" name="register">
        <input type="text" name="firstname" placeholder="firstname" id="firstname">
        <input type="text" name="lastname" placeholder="lastname" id="lastname">
        <input type="email" name="email" id="email" placeholder="email">
        <input type="tel" name="phone", id="phone" placeholder="phone">
        <input type="text" placeholder="username" name="username" required id="username">
        <input type="password" name="password" id="password" placeholder="password">
        <input type="submit" value="register">
    </form>
</body>
</html>
