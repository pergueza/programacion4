package Java.Universidad.Progra4.Tareas.Parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoFinal {
    public static final byte NUMEROS_DE_DATOS_DEL_USUARIO = 10;
    public static final byte TIPO_DOCUMENTO_DE_IDENTIFICACION = 0;
    public static final byte DOCUMENTO_IDENTIFICACION = 1;
    public static final byte NOMBRES = 2;
    public static final byte APELLIDOS = 3;
    public static final byte CORREO_ELECTRONICO = 4;
    public static final byte DIRECCION_RESIDENCIA = 5;
    public static final byte CIUDAD_RESIDENCIA = 6;
    public static final byte TELEFONO_DE_CONTACTO = 7;
    public static final byte CONTRASEÑA = 8;
    public static final byte CONFIRMAR_CONTRASEÑA = 9;

    public static Scanner leerDatoTeclado = new Scanner(System.in);
    public static List<String[]> usuarios = new ArrayList<>();

    public static void registrarUsuario(String tipoDocumentoDeIdentificacion, String docuemntoIdentificacion, String nombres,
    String apellidos, String correoElectronico, String direccionResidencia, String ciudadResidencia,  String telefonoDeContacto,
    String contraseña, String confirmarContraseña) {
        String[] usuario = new String[NUMEROS_DE_DATOS_DEL_USUARIO];

        usuario[TIPO_DOCUMENTO_DE_IDENTIFICACION] = tipoDocumentoDeIdentificacion;
        usuario[DOCUMENTO_IDENTIFICACION] = docuemntoIdentificacion;
        usuario[NOMBRES] = nombres;
        usuario[APELLIDOS] = apellidos;
        usuario[CORREO_ELECTRONICO] = correoElectronico;
        usuario[DIRECCION_RESIDENCIA] = direccionResidencia;
        usuario[CIUDAD_RESIDENCIA] = ciudadResidencia;
        usuario[TELEFONO_DE_CONTACTO] = telefonoDeContacto;
        usuario[CONTRASEÑA] = contraseña;
        usuario[CONFIRMAR_CONTRASEÑA] = confirmarContraseña;

        usuarios.add(usuario);
    }

    public static void solicitarDatosDeRegistro() {
        String tipoDocumentoDeIdentificacion, nombres, apellidos, correoElectronico, direccionResidencia,
        ciudadResidencia, contraseña, confirmarContraseña, docuemntoIdentificacion, telefonoDeContacto;

        System.out.print("\nTipo de documento: ");
        tipoDocumentoDeIdentificacion = leerDatoTeclado.nextLine();
        System.out.print("Documento de identificacion: ");
        docuemntoIdentificacion = leerDatoTeclado.nextLine();
        System.out.print("Nombres: ");
        nombres = leerDatoTeclado.nextLine();
        System.out.print("Apellidos: ");
        apellidos = leerDatoTeclado.nextLine();
        System.out.print("Correo Electronico: ");
        correoElectronico = leerDatoTeclado.nextLine();
        System.out.print("Direccion de residencia: ");
        direccionResidencia = leerDatoTeclado.nextLine();
        System.out.print("Ciudad de residencia: ");
        ciudadResidencia = leerDatoTeclado.nextLine();
        System.out.print("Telefono de contacto: ");
        telefonoDeContacto = leerDatoTeclado.nextLine();

        boolean noCoincidenContraseñas = true;
        do {
            System.out.print("Contraseña: ");
            contraseña = leerDatoTeclado.nextLine();
            System.out.print("Confirmar contraseña: ");
            confirmarContraseña = leerDatoTeclado.nextLine();

            if (!(contraseña.equals(confirmarContraseña))) {
                System.out.println("No coinciden ambas contraseñas, por favor vuelva a intentar.\n");
            }
            else {noCoincidenContraseñas = false;}
        } while (noCoincidenContraseñas);

        registrarUsuario(tipoDocumentoDeIdentificacion, docuemntoIdentificacion, nombres, apellidos,
        correoElectronico, direccionResidencia, ciudadResidencia, telefonoDeContacto, contraseña, confirmarContraseña);
    }

    public static boolean iniciarSesion(String correoElectronico, String contraseña) {
        for (String[] usuario : usuarios) {
            if (correoElectronico.equals(usuario[CORREO_ELECTRONICO])) {
                if (contraseña.equals(usuario[CONTRASEÑA])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void mostrarMenuLoginRegistro() {
        String correoElectronico, contraseña;
        boolean mostrarMenu = true;

        while (mostrarMenu) {
            System.out.println("Bienvenido a MyHotel...");
            System.out.println("Mas que un lugar para descansar.");
            System.out.println("----------------------------------------------");
            System.out.println("Ingrese la opcion deseada.");
            System.out.println("1. Registrarse como cliente.");
            System.out.println("2. Iniciar sesion.");
            System.out.println("3. Salir.");

            int opcion = leerDatoTeclado.nextInt();
            leerDatoTeclado.nextLine();

            switch (opcion) {
                case 1:
                    solicitarDatosDeRegistro();
                    break;
                case 2:
                    for (int intentos = 0; intentos < 3; intentos++) {
                        System.out.print("Correo Electronico: ");
                        correoElectronico = leerDatoTeclado.nextLine();
                        System.out.print("Contraseña: ");
                        contraseña = leerDatoTeclado.nextLine();
                        if (iniciarSesion(correoElectronico, contraseña)) {
                            System.out.println("Usuario logueado correctamente.\n");
                            break;
                        }
                        System.out.println("Usuario incorrecto, intente una vez mas.\n");
                        if (intentos == 2) {
                            System.out.println("Has superado el maximo de intentos. Adios.");
                            mostrarMenu = false;
                        }
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta pronto!");
                    mostrarMenu = false;
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        mostrarMenuLoginRegistro();
    }
}
