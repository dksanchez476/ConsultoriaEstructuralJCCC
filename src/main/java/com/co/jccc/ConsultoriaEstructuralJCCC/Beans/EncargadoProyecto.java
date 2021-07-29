package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EncargadoProyecto {
    @Id
    private int Id_Encargado_Proyecto;
    private String Nombre_Encargado;
    private String Nombre_Proyecto;
    private String Fecha_de_inicio;
    private String Fecha_Final;
    private String Observaciones;

    public int getId() {
        return Id_Encargado_Proyecto;
    }
    public void setId(int Id_EncargadoProyecto) {
        this.Id_Encargado_Proyecto = Id_Encargado_Proyecto;
    }

    public String getNombre_Encargado() {
        return Nombre_Encargado;
    }
    public void setNombre_Encargado (String Nombre_Encargado) {
        this.Nombre_Encargado = Nombre_Encargado;
    }

    public String getNombre_Proyecto() {
        return Nombre_Proyecto;
    }
    public void setNombre_Proyecto(String Nombre_Proyecto) {
        this.Nombre_Encargado = Nombre_Encargado;
    }

    public String getFecha_de_inicio() {
        return Fecha_de_inicio;
    }
    public void setFecha_de_inicio(String Fecha_de_inicio) {
        this.Fecha_de_inicio = Fecha_de_inicio;
    }

    public String getFecha_Final() {
        return Fecha_Final;
    }
    public void setFecha_Final(String Fecha_Final) {
        this.Fecha_Final = Fecha_Final;
    }

    public String getObservaciones() {
        return Observaciones;
    }
    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
}
