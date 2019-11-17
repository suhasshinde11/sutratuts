package com.practice.t2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "printEven", urlPatterns = "/printEven")
public class PrintEvenNumber extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        int firstNo = Integer.parseInt(request.getParameter("first"));
        int secondNo = Integer.parseInt(request.getParameter("second"));
        for (int i = firstNo; i < secondNo; i++) {
            if (i % 2 == 0) {
                out.println(i);
            }
        }

    }
}
