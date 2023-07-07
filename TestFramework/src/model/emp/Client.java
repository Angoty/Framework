package model.emp;

import etu1970.framework.ModelView;
import etu1970.framework.annotations.AppRoute;
import java.lang.reflect.Field;
import java.util.ArrayList;



public class Client {
    String name;
    FileUpload badge;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public FileUpload getBadge(){
        return badge;
    }

    public void setBadge(FileUpload badge){
        this.badge = badge;
    }

    public Client(){}
    public Client(String name, FileUpload file){
        this.name = name;
        this.badge = file;
    }

    @AppRoute(url="client.do")
    public ModelView getClient(){
        ModelView modelView = new ModelView();
        Client client = new Client(getName(),getBadge());
        modelView.setView("./pages/client.jsp");
        modelView.addItem("client",client);
        return modelView;
    }
}