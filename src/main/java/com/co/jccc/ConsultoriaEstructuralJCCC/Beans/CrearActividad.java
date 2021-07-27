package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;
import javax.persistence.*;
public class CrearActividad{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Activiad;
    private String NombreActividad;
    private String NombreEmpleado;
    private String Descripcion;
    private String Fecha_Publicacion;
    private String FechaLimiteEntrega;


    public String getNombreActividad() {
        return NombreActividad;
    }

    public void setNombreActividad(String NombreActividad) {
        this.NombreActividad = NombreActividad;
    }

    public String getNombreEmpleado() {
        return activitydescription;
    }

    public void setNombreEmppleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
 public String getFecha_Publicacion() {
        return Fecha_Publicacion;
    }

    public void setFecha_Publicacion(String Fecha_Publicacion) {
        this.Fecha_Publicacion = Fecha_Publicacion;
    }
    public String getFechaLimiteEntrega() {
        return FechaLimiteEntrega;
    }

    public void setFechaLimiteEntrega(String FechaLimiteEntrega) {
        this.FechaLimiteEntrega = FechaLimiteEntrega;
    }
}

