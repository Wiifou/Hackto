package fr.yncrea.cir3.webappdemo.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldController extends HttpServlet {
    private static final long serialVersionUID =1L;

    private int nombreVisites = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder content = new StringBuilder();
        content.append("<html><head><title>Hello</title></head><body>");
        content.append("URL : ").append(req.getRequestURI()).append("<br>");
        content.append("Hello world pour la " +  ++nombreVisites + "fois !");
        content.append("Upload of my dream and for the hacktoberfest");
        content.append("</body></html>");

        resp.getWriter().append(content.toString());
    }

}
