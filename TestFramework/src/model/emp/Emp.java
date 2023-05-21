package model.emp;

import etu1970.framework.ModelView;
import etu1970.framework.annotations.AppRoute;

public class Emp {
    String idEmp;
    
    @AppRoute(url="get")
    public String getid(){
        return this.idEmp;
    }

    public void setid(String id){
        this.idEmp=id;
    }

// redirect to an jsp file
    @AppRoute(url="home")
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
}