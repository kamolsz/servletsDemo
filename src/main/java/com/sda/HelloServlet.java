package com.sda;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       PrintWriter writer = response.getWriter();
       response.setCharacterEncoding("UTF-8"); //dla polskich znaków
        response.setContentType("text/html;charset=UTF-8");

       writer.println("<p>Hello World</p>");
       writer.println("<p></p>");
       writer.println("<p>Polskie ąśćżź</p>");
       writer.println("<p>test</p>");

    }

}
