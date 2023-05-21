package etu1970.framework.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import etu1970.framework.Mapping;
import java.util.HashMap;
import etu1970.framework.MappingUrls;


public class FrontServlet extends HttpServlet{
    HashMap<String, Mapping> mappingUrls = new HashMap<String, Mapping>();

    public void init() throws ServletException{
        String path=this.getServletConfig().getInitParameter("direction");
        String directory="WEB-INF/classes/"+path;
        String name=this.getServletContext().getRealPath(directory);
        name=name.replace("\\", "/");
        System.out.println(directory+name);
        mappingUrls=MappingUrls.getMethodsControllerURL(name, path);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String lastURL=request.getRequestURI().toString();
            response.getWriter().print("Dernier url-emplacement: "+lastURL);
            out.println("<br>");
            out.println("Nombre d'annotations: "+mappingUrls.keySet().size());
            out.println("<br>");
            for(String k: mappingUrls.keySet()){
                out.println("Url: "+k);
                out.println("<br>");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        processRequest(request, response);
    }
}