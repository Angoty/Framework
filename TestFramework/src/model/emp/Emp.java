package model.emp;

<<<<<<< HEAD
import etu1970.framework.ModelView;
=======
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
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
<<<<<<< HEAD

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
=======
}


>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
