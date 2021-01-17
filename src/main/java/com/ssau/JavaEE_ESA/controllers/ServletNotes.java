package com.ssau.JavaEE_ESA.controllers;

import com.ssau.JavaEE_ESA.beans.NoteBean;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletNotes", value = "/Notes")
public class ServletNotes extends HttpServlet {
    @EJB
    NoteBean noteBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("notesList", noteBean.findAll());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/notes.jsp");
        if(dispatcher != null){
            dispatcher.forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
