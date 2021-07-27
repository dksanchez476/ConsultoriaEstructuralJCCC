package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;

import javax.persistence.Id;


public class Asistencia {
    @Id
    private int Id_Asistencia;
    private String Fecha_de_Ingreso;
    private String Fecha_de_Salida;

    public Asistencia(int id_Asistencia, String fecha_de_Ingreso, String fecha_de_Salida) {
        this.Id_Asistencia = id_Asistencia;
        this.Fecha_de_Ingreso = fecha_de_Ingreso;
        this.Fecha_de_Salida = fecha_de_Salida;
    }

    public int getId_Asistencia() {
        return Id_Asistencia;
    }


    public String getFecha_de_Ingreso() {
        return Fecha_de_Ingreso;
    }

    public String getFecha_de_Salida() {
        return Fecha_de_Salida;
    }

    public void setId_Asistencia(int id_Asistencia) {
        Id_Asistencia = id_Asistencia;
    }

    public void setFecha_de_Ingreso(String fecha_de_Ingreso) {
        Fecha_de_Ingreso = fecha_de_Ingreso;
    }

    public void setFecha_de_Salida(String fecha_de_Salida) {
        Fecha_de_Salida = fecha_de_Salida;
    }
}
