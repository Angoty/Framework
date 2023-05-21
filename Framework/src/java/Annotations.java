package etu1970.framework.annotations;

import java.util.Vector;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.net.URL;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class Annotations{

    public static boolean takeAnnotation(Class<?> classe, Class<? extends Annotation> annot)throws Exception{
        Method[] m=classe.getDeclaredMethods();
        for(int i=0;i<m.length;i++){
            Method ma=m[i];
            if(ma.isAnnotationPresent(annot)){
                System.out.println("Annotation is present...");
                return true;
            }
        }
        return false;
    }
    
<<<<<<< HEAD
    public static Vector<Class<?>> getInPackage(String packagePath,String name) throws Exception{
=======
<<<<<<< HEAD
    public static Vector<Class<?>> getInPackage(String packagePath,String name) throws Exception{
=======
    public static Vector<Class<?>> getFiles(String packagePath,String name) throws Exception{
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
       Vector<Class<?>> classes = new Vector<Class<?>>();

        File packageDir = new File(packagePath);   
        
        if (packageDir.isDirectory()) {
            for (File file : packageDir.listFiles()) {
                if(file.isDirectory()){
                    String newPath="/"+file.getAbsolutePath();
                    newPath=newPath.replace("\\","/");
                    String nomPack=name+"."+file.getName();
<<<<<<< HEAD
                    classes.addAll(getInPackage(newPath,nomPack));
=======
<<<<<<< HEAD
                    classes.addAll(getInPackage(newPath,nomPack));
=======
                    classes.addAll(getFiles(newPath,nomPack));
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
                }
                if (file.getName().endsWith(".class")) {
                    String className = name + "." + file.getName().substring(0, file.getName().length() - 6);
                    classes.add(Class.forName(className));
                    System.out.println("Class with annotation: "+Class.forName(className));
                }
            }
        }
        return classes;
    }

    public static Vector<Class<?>> getAnnotation(String directory, String nomPack, Class<? extends Annotation> annotation) {
        System.out.println(directory);
        Vector<Class<?>> classes = new Vector<Class<?>>();
        try {
<<<<<<< HEAD
            for (Class<?> cls : getInPackage(directory, nomPack)) {
=======
<<<<<<< HEAD
            for (Class<?> cls : getInPackage(directory, nomPack)) {
=======
            for (Class<?> cls : getFiles(directory, nomPack)) {
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
                if (takeAnnotation(cls,annotation)) {
                    classes.add(cls);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classes;
    }
}

