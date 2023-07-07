package etu1970.framework;
import java.util.HashMap;

public class ModelView {
    String view;
    HashMap<String, Object> data;

    public String getView(){
        return this.view;
    }
    public HashMap<String, Object> getData(){
        return this.data;
    }
    public void setView(String vue) throws Exception{
        if(vue==null){
            throw new Exception("Vue invalide");
        }
        this.view=vue;
    }
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

}