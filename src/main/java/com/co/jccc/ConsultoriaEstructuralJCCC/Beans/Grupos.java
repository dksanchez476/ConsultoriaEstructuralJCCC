package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;

public class Grupos{
    private int id_Grupo;
    private int id_proyecto;
    private String codigoGrupo;
    private String fechaInicio;
    private String fechaDesactivacion; 

    public  String  getcodigoGrupo () {
        return  codigoGrupo ;
    }
    public  void  setcodigoGrupo ( String  codigoGrupo ) {
        this.codigoGrupo  = codigoGrupo ;
    }
    public  String  getfechaInicio () {
        return  fechaInicio ;
    }
    public  void  setfechaInicio ( String  fechaInicio ) {
        this.fechaInicio  = fechaInicio ;
    }
    
    public  String  getfechaDesactivacion () {
        return  fechaDesactivacion ;
    }
    public  void  setfechaDesactivacion ( String  fechaDesactivacion ) {
        this.fechaDesactivacion  = fechaDesactivacion ;
    }
 }