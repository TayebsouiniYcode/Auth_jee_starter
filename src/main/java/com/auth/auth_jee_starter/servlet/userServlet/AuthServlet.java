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
                System.out.println ("this path for login" );

                request.getRequestDispatcher("/auth/login.jsp").forward(request,response);
                break;
            case ("/register"):
                System.out.println ("This path for register" );
                //String firstname = request.getParameter ( "firstname");
                //String lastname = request.getParameter ( "lastname" );
                //String email = request.getParameter ( "email" );
                //String phone = request.getParameter ( "phone" );
                //String username = request.getParameter ( "username" );
                //String password = request.getParameter ( "password" );

                String firstname = "Tayeb";
                String lastname = "SOUINI";
                String email = "Tayeb@gmail.com";
                String phone = "0607189671";
                String username = "tayebsouini";
                String password = "1234";

                Users user = new Users ();
                user.setFirstname ( firstname );
                user.setLastname (lastname);
                user.setEmail ( email );
                user.setPhone ( phone );
                user.setUsername ( username );
                user.setPassword ( password );

                System.out.println ("User : " + user.toString () );


                    user = userService.add ( user );

                    request.getRequestDispatcher("/auth/register.jsp").forward(request,response);

                break;
        }


    }

    @Override
    protected void doPost ( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {

    }
}
