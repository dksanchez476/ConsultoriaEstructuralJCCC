package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;
import javax.persistence.*;
public class CrearActividad{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String activityname;
    private String activitydescription;


    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    public String getActivitydescription() {
        return activitydescription;
    }

    public void setActivitydescription(String activitydescription) {
        this.activitydescription = activitydescription;
    }
}

