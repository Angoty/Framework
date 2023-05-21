package model.emp;

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

}
