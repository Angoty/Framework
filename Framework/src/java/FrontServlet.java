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
<<<<<<< HEAD
import java.lang.reflect.Method;
import etu1970.framework.ModelView;
import javax.servlet.RequestDispatcher;
import java.util.Map;
=======
<<<<<<< HEAD
import java.lang.reflect.Method;
import etu1970.framework.ModelView;
import javax.servlet.RequestDispatcher;
=======
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc

>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838

public class FrontServlet extends HttpServlet{
    HashMap<String, Mapping> mappingUrls = new HashMap<String, Mapping>();

    public void init() throws ServletException{
        String path=this.getServletConfig().getInitParameter("direction");
        String directory="WEB-INF/classes/"+path;
        String name=this.getServletContext().getRealPath(directory);
        name=name.replace("\\", "/");
<<<<<<< HEAD
        // System.out.println(directory+name);
=======
<<<<<<< HEAD
        // System.out.println(directory+name);
=======
        System.out.println(directory+name);
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
            String[] urls=lastURL.split("/");
            if(urls.length>0){
            int indice=urls.length-1;
            String cle=urls[indice];
            if(mappingUrls.containsKey(cle)){
                try{
                    Mapping mapping=mappingUrls.get(cle);
                    String methode=mapping.getmethod();
                    Class<?> cls=Class.forName(mapping.getclassName());
                    Object obj = cls.getConstructor().newInstance();
                    Object value = cls.getMethod(mapping.getmethod()).invoke(obj);
                    System.out.println(obj);
                    if(value instanceof ModelView){
<<<<<<< HEAD
                            ModelView model= (ModelView) value;
                            String jsp=model.getView();
                            for(Map.Entry<String, Object> entry : model.getData().entrySet()) {
                                String key = String.valueOf(entry.getKey());
                                Object val = entry.getValue();
                                request.setAttribute(key, val);
                            }
                            RequestDispatcher dispat = request.getRequestDispatcher(jsp);
                            dispat.forward(request, response);
                    }else {
                        response.getWriter().write(value.toString());
=======
                        String jsp=((ModelView) value).getView();
                        RequestDispatcher dispat = request.getRequestDispatcher(jsp);
                        dispat.forward(request, response);
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
                    }
                }
                catch(Exception io){
                    System.out.println(io.getMessage());
                }
            }
<<<<<<< HEAD
        }
            
        }catch(Exception e){
=======
        }
            
        }catch(Exception e){
=======
        }
        catch(Exception e){
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
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