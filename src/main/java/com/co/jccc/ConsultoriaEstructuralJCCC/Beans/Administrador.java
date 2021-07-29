package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;

import com.sun.org.apache.xpath.internal.operations.String;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administrador {
@Id
    private int Id_adminitrador;
    private String Nombre_administrador;
    private String Apellido_administrador;
    private String Fecha_de_nacimiento;
    private String Tipo_de_identificacion;
    private int No_Documento;
    private  int Telefono;
    private String Correo;
    private String Foto;

    public Administrador(int id_adminitrador, String nombre_administrador, String apellido_administrador, String fecha_de_nacimiento, String tipo_de_identificacion, int no_Documento, int telefono, String correo, String foto) {
        Id_adminitrador = id_adminitrador;
        Nombre_administrador = nombre_administrador;
        Apellido_administrador = apellido_administrador;
        Fecha_de_nacimiento = fecha_de_nacimiento;
        Tipo_de_identificacion = tipo_de_identificacion;
        No_Documento = no_Documento;
        Telefono = telefono;
        Correo = correo;
        Foto = foto;
    }


    public int getId_adminitrador () {return Id_adminitrador;}
    public void setId_adminitrador (){ this.Id_adminitrador = Id_adminitrador;}

    public  String getNombre_administrador (){return Nombre_administrador;}
    public void setNombre_administrador (String Nombre_administrador){this.Nombre_administrador = Nombre_administrador;}

    public  String getApellido_administrador () {return  Apellido_administrador;}
    public void setApellido_administrador (String Apellido_administrador ) {this.Apellido_administrador = Apellido_administrador;}

    public String getFecha_de_nacimiento () {return Fecha_de_nacimiento;}
    public void setFecha_de_nacimiento (String Fecha_de_nacimiento) {this.Fecha_de_nacimiento = Fecha_de_nacimiento;}


    public String getTipo_de_identificacion () {return Tipo_de_identificacion;}
    public void setTipo_de_identificacion (String Tipo_de_identificacion) {this.Tipo_de_identificacion = Tipo_de_identificacion;}

    public int getNo_Documento () {return No_Documento;}
    public void setNo_Documento (int No_Documento) {this.No_Documento = No_Documento;}


    public int getTelefono () {return Telefono;}
    public void setTelefono (int Telefono) {this.Telefono = Telefono;}

    public String getCorreo (){return Correo;}
    public void setCorreo (String Correo){this.Correo=Correo;}

    public String getFoto (){return Foto;}
    public void setFoto (String Foto) {this.Foto=Foto;}






}
