package model.emp;

import etu1970.framework.ModelView;
import etu1970.framework.annotations.AppRoute;
import java.lang.reflect.Field;


public class Emp {
    String nom;
    String grade;
    
    @AppRoute(url="get")
    public String getnom(){
        return this.nom;
    }
    public String getgrade(){
        return this.grade;
    }

    public void setnom(String n){
        this.nom=n;
    }
    public void setgrade(String g){
        this.grade=g;
    }

    public Emp(){}
    public Emp(String n, String g){
        this.setnom(n);
        this.setgrade(g);
    }

// redirect to an jsp file
    @AppRoute(url="welcome")
    public ModelView redirect(){
        ModelView modele=new ModelView();
        try{
            modele=new ModelView("./pages/welcome.jsp");
            System.out.println(modele.getView());
        }
        catch(Exception io){
            io.printStackTrace();
        }

        return modele;
    }

// test a controller to a view
    @AppRoute(url="emp-list")
    public ModelView gotoView(){
        ModelView modele=new ModelView();
        try{
            modele=new ModelView("./pages/liste.jsp");
            Emp[] employes=new Emp[]{
                new Emp("Miller", "analyst"), new Emp("Jones", "manager"), new Emp("Allen", "trainee")
            };
            Field[] attributs=this.getClass().getDeclaredFields();
            modele.addItem("liste-employe", employes);
            modele.addItem("attributs", attributs);
            System.out.println(modele.getView());
        }
        catch(Exception io){
            io.printStackTrace();
        }
        return modele;
    }
}
