package etu1970.framework.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import etu1970.framework.Mapping;
import java.util.HashMap;


public class FrontServlet extends HttpServlet{
    HashMap<String, Mapping> mappingUrls = new HashMap<String, Mapping>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String lastURL=request.getRequestURI().toString();
            response.getWriter().print("Dernier url-emplacement: "+lastURL);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        processRequest(request, response);
    }
}