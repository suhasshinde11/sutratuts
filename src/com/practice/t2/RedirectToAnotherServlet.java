package com.practice.t2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "redFirst", urlPatterns = "/redFirst")
public class RedirectToAnotherServlet extends HttpServlet {
    /*public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = request.getParameter("data");
        request.getRequestDispatcher("redSecond").forward(request, response);
    }*/

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter out = response.getWriter();
        out.println("<h1> Welcome To Jsp</h1>");
        String data = request.getParameter("data");
        out.println(data);
        RequestDispatcher dispatcher = request.getRequestDispatcher("redSecond");
        dispatcher.forward(request, response);
    }
}
