package com.practice.t2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "redirectServlet", urlPatterns = "/redirectServlet")
public class SendRedirectServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int input = Integer.parseInt(request.getParameter("input"));
        if (input % 2 == 0) {
            response.sendRedirect("https://www.google.com");
        } else {
            response.sendRedirect("http://www.purplseq.com");
        }
    }
}
