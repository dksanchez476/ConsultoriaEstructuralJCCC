public class Ingeniero{
    private int id_ingeniero;
    private String nombreIngeniero;
    private String apellidoIngeniero;
    private String fechaNacimiento;
    private String numIdentificacion;
    private int Telefono;
    private String correo;
    private String foto;

    public  String  getnombreIngeniero () {
        return  nombreIngeniero ;
    }
    public  void  setnombreIngeniero ( String  nombreIngeniero ) {
        this.nombreIngeniero  =  nombreIngeniero ;
    }
    public  String  getapellidoIngeniero () {
        return  apellidoIngeniero ;
    }
    public  void  setapellidoIngeniero ( String  apellidoIngeniero ) {
        this.apellidoIngeniero  =  apellidoIngeniero ;
    }
    public  String  getfechaNacimiento () {
        return  fechaNacimiento ;
    }
    public  void  setfechaNacimiento ( String  fechaNacimiento ) {
        this.fechaNacimiento  =  fechaNacimiento ;
    }
    public  String  getnumIdentificacion () {
        return  numIdentificacion ;
    }
    public  void  setnumIdentificacion ( String  numIdentificacion ) {
        this.numIdentificacion  =  numIdentificacion ;
    }
    public  int  getTelefono () {
        return  Telefono ;
    }
    public  void  setTelefono ( int Telefono ) {
        this.Telefono  =  Telefono ;
    }
    public  String  getcorreo () {
        return  correo ;
    }
    public  void  setcorreo ( String  correo ) {
        this.correo  =  correo ;
    }
    public  String  getfoto () {
        return  foto ;
    }
    public  void  setfoto ( String  foto ) {
        this.foto  =  foto ;
    }
}