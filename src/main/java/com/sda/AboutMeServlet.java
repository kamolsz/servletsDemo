package com.sda;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "AboutMeServlet",
        urlPatterns = {"/about"},
        loadOnStartup = 2
)

public class AboutMeServlet extends HttpServlet {

    private final static Logger logger = Logger.getLogger(AboutMeServlet.class);

    @Override
    public void init() throws ServletException {
        logger.info("I should be initialized second");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        writer.println("<p>Kamil Olszewski</p>");
    }
}
