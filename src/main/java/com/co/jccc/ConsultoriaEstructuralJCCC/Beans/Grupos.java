public class Grupos{
    private int id_Grupo;
    private int id_proyecto;
    private int codigoGrupo;
    private date fechaInicio;
    private date fechaDesactivacion; 

    public  int  getcodigoGrupo () {
        return  codigoGrupo ;
    }
    public  void  setcodigoGrupo ( int  codigoGrupo ) {
        this.codigoGrupo  = codigoGrupo ;
    }
    public  date  getfechaInicio () {
        return  fechaInicio ;
    }
    public  void  setfechaInicio ( date  fechaInicio ) {
        this.fechaInicio  = fechaInicio ;
    }
    
    public  date  getfechaDesactivacion () {
        return  fechaDesactivacion ;
    }
    public  void  setfechaDesactivacion ( date  fechaDesactivacion ) {
        this.fechaDesactivacion  = fechaDesactivacion ;
    }
 }