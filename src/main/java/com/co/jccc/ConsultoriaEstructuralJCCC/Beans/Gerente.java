package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;

public class Gerente {

    private int Id_Gerente;
    private String Nombre_Gerente;
    private String Apellido_Gerente;
    private String Fecha_de_Nacimiento;
    private String TipoIdentificacion;
    private int No_Documento;
    private String Telefono;
    private String Correo;
    private String Foto;


    public int getId_Gerente() {
        return Id_Gerente;
    }

    public void setId_Gerente(int id_Gerente) {
        Id_Gerente = id_Gerente;
    }

    public String getNombre_Gerente() {
        return Nombre_Gerente;
    }

    public void setNombre_Gerente(String nombre_Gerente) {
        Nombre_Gerente = nombre_Gerente;
    }

    public String getApellido_Gerente() {
        return Apellido_Gerente;
    }

    public void setApellido_Gerente(String apellido_Gerente) {
        Apellido_Gerente = apellido_Gerente;
    }

    public String getFecha_de_Nacimiento() {
        return Fecha_de_Nacimiento;
    }

    public void setFecha_de_Nacimiento(String fecha_de_Nacimiento) {
        Fecha_de_Nacimiento = fecha_de_Nacimiento;
    }

    public String getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        TipoIdentificacion = tipoIdentificacion;
    }

    public int getNo_Documento() {
        return No_Documento;
    }

    public void setNo_Documento(int no_Documento) {
        No_Documento = no_Documento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }
}
