package etu1970.framework;

public class ModelView {
    String view;

    public String getView(){
        return this.view;
    }
    public void setView(String vue) throws Exception{
        if(vue==null){
            throw new Exception("Vue invalide");
        }
        this.view=vue;
    }
    public ModelView(){
        
    }
    
    public ModelView(String v) throws Exception{
        setView(v);
    }
}