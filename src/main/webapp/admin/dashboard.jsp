<%@ page import="com.auth.auth_jee_starter.entity.Users" %>
<%@ include file = "../componants/header.jsp" %>

  <h1 class="text-primary">This is dashboard</h1>
    <%
        Users user = (Users) request.getAttribute ( "user" );

        out.println ("username: " + user.getUsername ());
        out.println ("firstna:e: " + user.getFirstname () + "" +
                "lastname: " + user.getLastname () + "" +
                "\n email: " +user.getEmail () + "" +
                "\n phone: " + user.getPhone ());
        out.println ("role: " + user.getRole ().getName ());
    %>

<%@ include file = "../componants/footer.jsp" %>