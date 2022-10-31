<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 26/10/2022
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>This is login</h1>
    <p style="color: red">
        <%
            if (request.getAttribute ( "errorMessage" ) != null){
                out.println (request.getAttribute ( "errorMessage" ));
            }
        %>
    </p>
    <form name="login" method="post">
        <input placeholder="username" name="username" id="username" type="text">
        <input placeholder="password" name="password" id="password" type="password">
        <input type="submit" value="Login">
    </form>
</body>
</html>
