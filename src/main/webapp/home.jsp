<%@ page import="com.auth.auth_jee_starter.entity.Users" %>


<%
    Users user = (Users) request.getAttribute("user");
    out.println (user.toString ());
%>
