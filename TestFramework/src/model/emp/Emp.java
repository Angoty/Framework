package model.emp;

import etu1970.framework.ModelView;
import etu1970.framework.annotations.AppRoute;
import java.lang.reflect.Field;
import java.util.ArrayList;



public class Emp {
    String nom;
    String grade;
    int id;
    
    @AppRoute(url="get")
    public String getnom(){
        return this.nom;
    }
    public String getgrade(){
        return this.grade;
    }
    public int getid(){
        return this.id;
    }
    public void setnom(String n){
        this.nom=n;
    }
    public void setgrade(String g){
        this.grade=g;
    }

    public void setid(int i){
        this.id=i;
    }

    public Emp(){}
    public Emp(String n, String g, int id){
        this.setnom(n);
        this.setgrade(g);
        this.setid(id);
    }
    public Emp(String n, String g){
        this.setnom(n);
        this.setgrade(g);
    }

// redirect to an jsp file
    @AppRoute(url="welcome.do")
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
    @AppRoute(url="emp-list.do")
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

    @AppRoute(url="detail")
    public ModelView getDetails(){
        ModelView modele = new ModelView();
        try{
            ArrayList<Emp> liste = new ArrayList<Emp>();
            liste.add(new Emp("Miller","analyst",32));
            liste.add(new Emp("Jones","manager",24));
            liste.add(new Emp("Allen","trainee",28));
            modele=new ModelView("./pages/details.jsp");
            modele.addItem("details",liste.get(id));
        }catch(Exception io){
            io.printStackTrace();
        }
        return modele;
    }
}
