gi
package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;
import javax.persistence.*;

@Entity
public class Delineante{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDelineante;

    private String Nombre_Delineante;
    private String Apellidos_Delineante;
    private String FechaNacimiento;
    private String TipoIdentificacion;
    private String No_Documento;
    private String telefono;
    private String Correo;
    private String Foto;
    private String EstadoDelineante;


    public String getNombre_Delineante() {
        return Nombre_Delineante;
    }

    public void setNombre_Delineante(String Nombre_Delineante) {
        this.Nombre_Delineante = Nombre_Delineante;
    }

    public String getApellidos_Delineante() {
        return Apellidos_Delineante;
    }

    public void setApellidos_Delineante(String Apellidos_Delineante) {
        this.Apellidos_Delineante = Apellidos_Delineante;
    }

     public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNo_Documento() {
        return No_Documento;
    }

    public void setNo_Documento(String No_Documento) {
        this.No_Documento = No_Documento;
    }

    public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getEstadoDelieante() {
        return EstadoDelineante;
    }

    public void setEstadoDelineante(String EstadoDelineante) {
        this.EstadoDelineante = EstadoDelineante;
    }

    


}
