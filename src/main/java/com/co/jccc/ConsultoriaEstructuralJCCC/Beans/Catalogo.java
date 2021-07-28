package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;
import javax.persistence.*;

@Entity
public class Catalogo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCatalogo;

    private String Tipo_Proyecto;
    private String Nombre_Proyecto;
    private String Empresa_Contratante;
    private String Area;
    private String Nombre_Participantes;

    public String getTipo_Proyecto() {
        return Tipo_Proyecto;
    }

    public void setTipo_Proyecto(String Tipo_Proyecto) {
        this.Tipo_Proyecto = Tipo_Proyecto;
    }

    public String getNombre_Proyecto() {
        return Nombre_Proyecto;
    }

    public void setNombre_Proyecto(String Nombre_Proyecto) {
        this.Nombre_Proyecto = Nombre_Proyecto;
    }

     public String getEmpresa_Contratante() {
        return Empresa_Contratante;
    }

    public void setEmpresa_Contratante(String Empresa_Contratante) {
        this.Empresa_Contratante = Empresa_Contratante;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getNombre_Participantes() {
        return Nombre_Participantes;
    }

    public void setNombre_Participantes(String Nombre_Participantes) {
        this.Nombre_Participantes = Nombre_Participantes;
    }

}