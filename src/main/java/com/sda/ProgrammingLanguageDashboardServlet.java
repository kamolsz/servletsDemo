package com.sda;

import org.apache.log4j.Logger;
import services.AddProgrammingServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "ProgrammingLanguageDashboardServlet",
        urlPatterns = {"/programming", "/Programming"},
        loadOnStartup = 1
)

public class ProgrammingLanguageDashboardServlet extends HttpServlet {

    private final static Logger logger = Logger.getLogger(AboutMeServlet.class);

    @Override
    public void init() throws ServletException {
        logger.info("I should be initialized first");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<style>");
        writer.println("table {margin:auto; width:60%; border: 2px solid black},");
        writer.println("th, td {border: 2px solid black;},");
        writer.println("</style>");

        writer.println("</head>");

        writer.println("<body>");
///, style="float:center", style = "border: 2px solid black"
        writer.println(" <table border =\"1\">");
        writer.println("<tr>");
        writer.println("<th>Programming language</th> <th>Application</th> <th>difficulty</th>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Java</td> <td>WEB, Desktop, Mobile</td> <td>3/5</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>PHP</td> <td>WEB</td> <td>2/5</td>");
        writer.println("</tr>");

        writer.println("</body>");
        writer.println("</html>");

        AddProgrammingServices.viewWholeListOfProgrammingLanguages();
    }


}
