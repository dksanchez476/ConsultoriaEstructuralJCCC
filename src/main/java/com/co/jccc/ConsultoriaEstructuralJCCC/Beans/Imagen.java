package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Imagen {
@Id

    private int Id_imagen;
    private String imagen;

    public int  getId_Imagen (){return Id_imagen;}
    public void setId_imagen (int Id_imagen){this.Id_imagen= Id_imagen;}

    public String getimagen () {return imagen;}
    public void setimagen (String imagen){this.imagen=imagen;}

}
