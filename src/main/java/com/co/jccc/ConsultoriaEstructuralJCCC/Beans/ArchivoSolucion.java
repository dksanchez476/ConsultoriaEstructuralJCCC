package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;

public class ArchivoSolucion {
    private int Id_ArchivoSolucion;
    private String FechaEntrega;
    private String Archivo;
    private String EstadoAchivo;

    public int getId_ArchivoSolucion() {
        return Id_ArchivoSolucion;
    }

    public void setId_ArchivoSolucion(int id_ArchivoSolucion) {
        Id_ArchivoSolucion = id_ArchivoSolucion;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }

    public String getArchivo() {
        return Archivo;
    }

    public void setArchivo(String archivo) {
        Archivo = archivo;
    }

    public String getEstadoAchivo() {
        return EstadoAchivo;
    }

    public void setEstadoAchivo(String estadoAchivo) {
        EstadoAchivo = estadoAchivo;
    }
}
