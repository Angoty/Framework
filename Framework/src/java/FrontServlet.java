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
import java.lang.reflect.Method;
import etu1970.framework.ModelView;
import javax.servlet.RequestDispatcher;
import java.util.Map;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.sql.Date;
import java.util.ArrayList;
import java.lang.reflect.Parameter;




public class FrontServlet extends HttpServlet{
    HashMap<String, Mapping> mappingUrls = new HashMap<String, Mapping>();

    public void init() throws ServletException{
        String path=this.getServletConfig().getInitParameter("direction");
        String directory="WEB-INF/classes/"+path;
        String name=this.getServletContext().getRealPath(directory);
        name=name.replace("\\", "/");
        // System.out.println(directory+name);
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
            String[] urls=lastURL.split("/");
            if(urls.length>0){
            int indice=urls.length-1;
            String cle=urls[indice];
            if(mappingUrls.containsKey(cle)){
                try{
                    Mapping mapping=mappingUrls.get(cle);
                    Class<?> cls=Class.forName(mapping.getclassName());
                    Method m=cls.getDeclaredMethod(mapping.getmethod());
                    Class type=m.getReturnType();
                    Object obj = cls.getConstructor().newInstance();
                    Enumeration<String> formParams = request.getParameterNames();
                    System.out.println(formParams);
                    ArrayList<String> paramsValues = new ArrayList<String>();
                    if(formParams!=null){
                        while(formParams.hasMoreElements()){
                            String param = formParams.nextElement();
                            if(checkField(param, cls)==true){
                                String attr = request.getParameter(param);
                                setData(cls, obj, param,attr);
                            }
                        }
                    }
                    if(hasFileUpload(classe)){
                        System.out.println("has fileUpload");
                        InputStream in2 = getServletContext().getResourceAsStream("/WEB-INF/web.xml");
                        String folderPath = staxParser.getFileFolder(in2);
                        configureUpload(request,classe, obj, folderPath);
                    }
                    if(type.equals(ModelView.class)){
                        ModelView modelView = new ModelView();
                        Parameter[] methodParams = m.getParameters();
                        Class[] types = m.getParameterTypes();
                        if(methodParams!=null){
                            ArrayList<Object> listArgs = new ArrayList<Object>();
                            for(int i=0;i<methodParams.length;i++){
                                for(String p: paramsValues){
                                    if(methodParams[i].getName().equals(p)){
                                        if (types[i]==Integer.class){
                                            listArgs.add(Integer.valueOf(request.getParameter(p)));
                                        }else if ( types[i]==Double.class) {
                                            listArgs.add(Double.valueOf(request.getParameter(p)));
                                        }else if ( types[i]==Float.class) {
                                            listArgs.add(Float.valueOf(request.getParameter(p)));
                                        }else if(types[i] == Date.class){
                                            listArgs.add(Date.valueOf(request.getParameter(p)));
                                        }else{
                                            listArgs.add(types[i].cast(request.getParameter(p)));
                                        }
                                    }
                                }
                            }
                            Object[] args = new Object[listArgs.size()];
                            args = listArgs.toArray(args);
                            modelView = (ModelView) m.invoke(obj,args);
                        }else{
                            modelView = (ModelView) m.invoke(obj);
                        }
                        String view = modelView.getView();
                        HashMap<String,Object> modelViewData = modelView.getData();
                        if(modelViewData.size()>0){
                            for(String k: modelViewData.keySet()){
                                request.setAttribute(k,modelViewData.get(k));
                            }
                        }
                        request.getRequestDispatcher(view).forward(request,response);
                    }else {
                        throw new Exception("Not instance of ModelView");
                    }
                }
                catch(Exception io){
                    System.out.println(io.getMessage());
                }
            }
        }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void configureUpload(HttpServletRequest request, Class classe, Object obj, String folderPath) throws Exception{
        String contentType = request.getContentType();
        if (contentType != null && contentType.startsWith("multipart/form-data")) {
            System.out.println("multipart/form-data");
            // String folderPath = getFileFolder();
            for (Part filePart : request.getParts()) {
            System.out.println("multipart/form-data boucle");
                System.out.println(filePart.getName()+" "+filePart.getSubmittedFileName());
                // raha mitovy @ ao am field
                if(checkField(filePart.getName(),classe)==true && classe.getDeclaredField(filePart.getName()).getType().equals(FileUpload.class)){
                    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
                    String filePath = folderPath+fileName;
                    InputStream fileContent = filePart.getInputStream();

                    // put into bytes
                    byte[] array = fileContent.readAllBytes();
                    if(!fileName.isEmpty()){
                        OutputStream os = (OutputStream) new FileOutputStream(filePath);
                        os.write(array);
                    }
                    FileUpload fileUpload = new FileUpload(fileName, filePath, array);

                    // set it
                    Field f = classe.getDeclaredField(filePart.getName());
                    Method setMethod = getMethod("set",f,classe);

                    setMethod.invoke(obj,fileUpload);
                }
            }
        }
    }
    public Method getMethod(String prefix, Field f, Class classe) throws NoSuchMethodException {
        String field = f.getName();
        String name = prefix+field;
        Method[] list = classe.getDeclaredMethods();
        for(Method m: list){
            if(m.getName().equalsIgnoreCase(name)){
                return m;
            }
        }
        return null;
    }

    public boolean checkField(String fieldName, Class classe){
        Field[] fields = classe.getDeclaredFields();
        for(Field f: fields){
            if(fieldName.equals(f.getName())){
                return true;
            }
        }
        return false;
    }

    public void setData(Class classe, Object obj, String parametre, String attr)throws Exception{
        Field f = classe.getDeclaredField(parametre);
        Class type = getMethod("get", f,classe).getReturnType();
        Method setMethod = getMethod("set",f,classe);
        if (type==int.class){
            setMethod.invoke(obj,Integer.parseInt(attr));
        }else if ( type==double.class) {
            setMethod.invoke(obj,Double.parseDouble(attr));
        }else if ( type==float.class) {
            setMethod.invoke(obj,Float.parseFloat(attr));
        }else if(type == Date.class){
            setMethod.invoke(obj,Date.valueOf(attr));
        }
        else{
            Object value = attr;
            setMethod.invoke(obj,type.cast(parametre));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        processRequest(request, response);
    }
}