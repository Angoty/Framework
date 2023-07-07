package model.emp;

import java.sql.Date;
import etu1970.framework.ModelView;
import etu1970.framework.annotations.AppRoute;

public class Citoyen{
    
    String nom;
    int age;
    boolean etudiant;
    float taille;
    Date temps;
    double survie;

    public String getNom(){
        return this.nom;
    }
    public int getAge(){
        return this.age;
    }
    public boolean getEtudiant(){
        return this.etudiant;
    }
    public float getTaille(){
        return this.taille;
    }
    public Date getTemps(){
        return this.temps;
    }
    public double getSurvie(){
        return this.survie;
    }

    public void setNom(String n){
        this.nom=n;
    }
    public void setAge(int a){
        this.age=a;
    }
    public void setEtudiant(boolean b){
        this.etudiant=b;
    }
    public void setTaille(float p){
        this.taille=p;
    }
    public void setTemps(Date d){
        this.temps=d;
    }
    public void setSurvie(double s){
        this.survie=s;
    }

    public Citoyen(){}
    public Citoyen(String nom, int age){
        this.setNom(nom);
        this.setAge(age);
    }

// test controller to view
    @AppRoute(url="save")
    public String insert(){
        String value=this.getNom()+"-"+this.getAge()+"-"+this.getEtudiant()+"-"+this.getTaille()+"-"+this.getSurvie();
        return value;
    }

// test a view to controller
    @AppRoute(url="form.do")
    public ModelView gotoController(){
        ModelView modele=new ModelView();
        try{
            modele=new ModelView("./pages/formulaire.jsp");
            System.out.println(modele.getView());
        }
        catch(Exception io){
            io.printStackTrace();
        }

        return modele;
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> main
>>>>>>> main
}