package etu1970.framework;
<<<<<<< HEAD
import java.util.HashMap;

public class ModelView {
    String view;
    HashMap<String, Object> data;
=======

public class ModelView {
    String view;
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc

    public String getView(){
        return this.view;
    }
<<<<<<< HEAD
    public HashMap<String, Object> getData(){
        return this.data;
    }
=======
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
    public void setView(String vue) throws Exception{
        if(vue==null){
            throw new Exception("Vue invalide");
        }
        this.view=vue;
    }
<<<<<<< HEAD
    public void setData(HashMap<String, Object> data) throws Exception{
        if(data==null){
            throw new Exception("data invalide");
        }
        this.data=data;
    }
    public ModelView(){
        
    }
        
    public ModelView(String v) throws Exception{
        this.setView(v);
        this.setData(new HashMap<String, Object>());
    }
    
    public void addItem(String key, Object obj){
        this.getData().put(key, obj);
    }

=======
    public ModelView(){
        
    }
    
    public ModelView(String v) throws Exception{
        setView(v);
    }
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
}