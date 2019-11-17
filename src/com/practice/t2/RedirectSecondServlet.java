package com.practice.t2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "redSecond", urlPatterns = "/redSecond")
public class RedirectSecondServlet extends HttpServlet {

    public void doPost(HttpServletResponse response, HttpServletRequest request) throws IOException {
        //response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("String entered in lower case" + request.getParameter("data").toLowerCase());
    }
}

