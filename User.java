public class User {
    public String identificationType;
    public String identificationNumber;
    public String names;
    public String surnames;
    public String email;
    public String adress;
    public String cityResidence;
    public String cellphoneNumber;
    public String password;
    public String confirmPassword;

    User (String tipoDocumentoDeIdentificacion, String docuemntoIdentificacion, String nombres,
    String apellidos, String correoElectronico, String direccionResidencia, String ciudadResidencia,  String telefonoDeContacto,
    String contraseña, String confirmarContraseña){
        
        this.identificationType = tipoDocumentoDeIdentificacion;
        this.identificationNumber = docuemntoIdentificacion;
        this.names = nombres;
        this.surnames = apellidos;
        this.email = correoElectronico;
        this.adress = direccionResidencia;
        this.cityResidence = ciudadResidencia;
        this.cellphoneNumber = telefonoDeContacto;
        this.password = contraseña;
        this.confirmPassword = confirmarContraseña;
    }

    public String getPassword(){
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }
}
