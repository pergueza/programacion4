public class User {
    public String tipoDocumentoDeIdentificacion;
    public String docuemntoIdentificacion;
    public String nombres;
    public String apellidos;
    public String correoElectronico;
    public String direccionResidencia;
    public String ciudadResidencia;
    public String telefonoDeContacto;
    public String contraseña;
    public String confirmarContraseña;

    User (String tipoDocumentoDeIdentificacion, String docuemntoIdentificacion, String nombres,
    String apellidos, String correoElectronico, String direccionResidencia, String ciudadResidencia,  String telefonoDeContacto,
    String contraseña, String confirmarContraseña){
        
        this.tipoDocumentoDeIdentificacion = tipoDocumentoDeIdentificacion;
        this.docuemntoIdentificacion = docuemntoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.ciudadResidencia = ciudadResidencia;
        this.telefonoDeContacto = telefonoDeContacto;
        this.contraseña = contraseña;
        this.confirmarContraseña = confirmarContraseña;
    }

    public String getContraseña(){
        return this.contraseña;
    }

    public String getCorreoElectronico(){
        return this.correoElectronico;
    }
}
