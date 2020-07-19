package com.sda;

import org.apache.log4j.Logger;
import services.AddProgrammingServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

@WebServlet(
        name = "AddProgrammingLanguageServlet",
        urlPatterns = {"/add", "/addProgramming"},
        loadOnStartup = 3
)
public class AddProgrammingLanguageServlet extends HttpServlet {

    //private final static Logger logger = Logger.getLogger(AboutMeServlet.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String programmingLanguageName = request.getParameter("ProgrammingLanguageName");
        String programmingLanguageLevel = request.getParameter("ProgrammingLanguageLevel");
        String programmingLanguageUse = request.getParameter("ProgrammingLanguageUse");

        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(programmingLanguageName, programmingLanguageLevel, programmingLanguageUse);
        LinkedList <ProgrammingLanguage> listOfProgrammingLanguages = new LinkedList<>();

        listOfProgrammingLanguages.add(programmingLanguage);
        AddProgrammingServices.addNewLanguage(programmingLanguage);

        AddProgrammingServices.viewWholeListOfProgrammingLanguages();




        //redirect
        response.sendRedirect("/programming");


     /*   //forward
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/addnote");
        requestDispatcher.forward(request,response);*/


        //logger.info("noteContent: " + noteContent);
    }

    // http://localhost:8081/hello?noteContent=zakupy
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>ADD</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<p><H1>Add new programming language</h1></p>");

        writer.println("<form method='post' action='/add'>");
        writer.println("<label for='ProgrammingLanguageName'>Programming language name:</label>");
        writer.println("<input id='ProgrammingLanguageName' type='text' name='ProgrammingLanguageName'/>");
        writer.println("<br>");
       // writer.println("<input type='submit' value='Add'/>");
       // writer.println("</form>");

       // writer.println("<form method='post' action='/add'>");
        writer.println("<label for='ProgrammingLanguageName'>Programming language level:</label>");
        writer.println("<input id='ProgrammingLanguageLevel' type='radio' '1/5' name='ProgrammingLanguageLevel' " +
                "value = '1/5' />");
        writer.println("<label for='1/5'>1/5</label>");
        writer.println("<input id='ProgrammingLanguageLevel' type='radio' '2/5' name='ProgrammingLanguageLevel' " +
                "value = '2/5' />");
        writer.println("<label for='2/5'>2/5</label>");
        writer.println("<input id='ProgrammingLanguageLevel' type='radio' '3/5' name='ProgrammingLanguageLevel' " +
                "value = '3/5' />");
        writer.println("<label for='3/5'>3/5</label>");
        writer.println("<input id='ProgrammingLanguageLevel' type='radio' '4/5' name='ProgrammingLanguageLevel' " +
                "value = '4/5' />");
        writer.println("<label for='4/5'>4/5</label>");
        writer.println("<input id='ProgrammingLanguageLevel' type='radio' '5/5' name='ProgrammingLanguageLevel' " +
                "value = '5/5' />");
        writer.println("<label for='5/5'>5/5</label>");
        writer.println("<br>");
       // writer.println("<input type='submit' value='Add'/>");
       // writer.println("</form>");

      // writer.println("<form method='post' action='/add'>");
        writer.println("<label for='ProgrammingLanguageUse'>Programming language use:</label>");
        writer.println("<input id='ProgrammingLanguageUse' type='text' name='ProgrammingLanguageUse'/>");
        writer.println("<br>");
        writer.println("<input type='submit' value='Add'/>");
        writer.println("</form>");

        writer.println("</body>");
        writer.println("</html>");
    }

}
