package com.digi.controller;

import com.digi.repository.UserRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String age = request.getParameter("age");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserRepository userRepository = new UserRepository();
        userRepository.insert(name, surname, Integer.parseInt(age), email, password);
        response.sendRedirect("/homePage.jsp");
    }
}
