package etu1970.framework;

import java.util.Map;
import java.util.HashMap;
import etu1970.framework.Mapping;
import java.util.Vector;
import java.lang.reflect.Method;
import etu1970.framework.annotations.Annotations;
import etu1970.framework.annotations.AppRoute;

public class MappingUrls{
    public static HashMap<String, Mapping> getMethodsControllerURL(String directory, String name){
        Vector<Class<?>> controllers = Annotations.getAnnotation(directory, name, AppRoute.class);
        HashMap<String, Mapping> urlMapping = new HashMap<String, Mapping>();
        try{
            for (Class<?> controller : controllers) {
                Method[] controllerMethods = controller.getMethods();
                for (Method method : controllerMethods) {
                    if (method.isAnnotationPresent(AppRoute.class)) {
                        Mapping mapping = new Mapping();
                        mapping.setclassName(controller.getName());
                        mapping.setmethod(method.getName());
                        AppRoute appRoute = method.getAnnotation(AppRoute.class);
                        String url = appRoute.url();
                        urlMapping.put(url, mapping);
                    }
                }
            }
        }catch(Exception io){
            System.out.println(io.getMessage());
        }
        return urlMapping;
    }
}