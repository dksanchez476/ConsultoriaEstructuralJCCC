package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;
import javax.persistence.*;

public class PublicarActividad{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String NombreProyecto;
    private String TipoProyecto;
    private String FechaRealizacionProyecto;
    private String Estado;


    public String getNombreProyecto() {
        return NombreProyecto;
    }

    public void setNombreProyecto(String NombreProyecto) {
        this.NombreProyecto = NombreProyecto;
    }

    public String getTipoProyecto() {
        return TipoProyecto;
    }

    public void setTipoProyecto(String TipoProyecto) {
        this.TipoProyecto = TipoProyecto;
    }

     public String getFechaRealizacionProyecto() {
        return FechaRealizacionProyecto;
    }

    public void setFechaRealizacionProyecto(String FechaRealizacionProyecto) {
        this.FechaRealizacionProyecto = FechaRealizacionProyecto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }




}
