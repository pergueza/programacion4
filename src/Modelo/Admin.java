public class Admin extends User{

    public Admin(String tipoDocumentoDeIdentificacion,
                         String docuemntoIdentificacion, String nombres,
                         String apellidos, String correoElectronico,
                         String direccionResidencia, String ciudadResidencia,
                         String telefonoDeContacto, String contraseña,
                         String confirmarContraseña) {
        super(tipoDocumentoDeIdentificacion, docuemntoIdentificacion, nombres,
              apellidos, correoElectronico, direccionResidencia, ciudadResidencia,
              telefonoDeContacto, contraseña, confirmarContraseña);
    }
}
