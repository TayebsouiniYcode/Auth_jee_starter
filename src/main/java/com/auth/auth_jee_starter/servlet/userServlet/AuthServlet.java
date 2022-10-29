package com.auth.auth_jee_starter.servlet.userServlet;

import com.auth.auth_jee_starter.entity.Users;
import com.auth.auth_jee_starter.service.IUserService;
import com.auth.auth_jee_starter.service.serviceImplementation.UserServiceImp;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

//@WebServlet(name = "LoginServlet", value = "/login")
@WebServlet(name = "AuthServlet", urlPatterns = {"/login", "/register"})
public class AuthServlet extends HttpServlet {
    IUserService userService = new UserServiceImp ();
    @Override
    protected void doGet ( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {
        String path = request.getServletPath();

        switch (path) {
            case ("/login"):
                request.getRequestDispatcher("/auth/login.jsp").forward(request,response);
                break;
            case ("/register"):
                request.getRequestDispatcher("/auth/register.jsp").forward(request,response);
                break;
        }


    }

    @Override
    protected void doPost ( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {
        String path = request.getServletPath();

        switch (path) {
            case "/register":
                String firstname = request.getParameter ( "firstname");
                String lastname = request.getParameter ( "lastname" );
                String email = request.getParameter ( "email" );
                String phone = request.getParameter ( "phone" );
                String username = request.getParameter ( "username" );
                String password = request.getParameter ( "password" );

                Users user = new Users (firstname, lastname, email, phone, username, password);

                user = userService.add ( user );
                break;

        }


    }
}
