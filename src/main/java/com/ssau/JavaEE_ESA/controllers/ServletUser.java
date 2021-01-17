package com.ssau.JavaEE_ESA.controllers;

import com.ssau.JavaEE_ESA.beans.UserBean;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Users")
public class ServletUser extends HttpServlet {
    @EJB
    private UserBean userBean;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("usersList", userBean.findAll());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/page.jsp");
        if(dispatcher != null){
            dispatcher.forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
