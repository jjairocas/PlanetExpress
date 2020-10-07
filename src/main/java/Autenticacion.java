import java.util.ArrayList;
import java.util.Scanner;

public class Autenticacion {

    public static ArrayList<Usuario> usuarios_cargados = CargarDatos.cargarUsuarios();

    public static Usuario iniciarSesion(){
        ArrayList<Usuario> usuarios_cargados = CargarDatos.cargarUsuarios();
        Scanner input = new Scanner(System.in);
        if(!usuarios_cargados.isEmpty()){
            System.out.print("Cédula: ");
            String cedula=input.next();
            if(cedulaEncontrada(cedula)){
                Usuario usuario = buscarUsuario(cedula);
                System.out.print("Constraseña: ");
                String password = input.next();
                assert usuario != null;
                if(usuario.password.equals(password)){
                    System.out.println();
                    System.out.println("Bienvenido "+ usuario.nombre);
                    System.out.println();
                    return usuario;
                }
                else {
                    System.out.println("Contraseña incorrecta");
                    return null;
                }
            }
            else {
                System.out.println("Usuario no encontrado");
                return  null;
            }
        }
        else {
            System.out.println("No hay usuarios registrados");
            return  null;
        }
    }

    public static void registrarse(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre:");
        String nombre = input.next();
        System.out.print("Apellidos:");
        String apellidos = input.next();
        System.out.print("cédula:");
        String cedula=input.next();
        if(!usuarios_cargados.isEmpty()){
            if(!cedulaEncontrada(cedula)){
                System.out.print("Correo:");
                String correo=input.next(); // falta validar el correo
                String rol = elegirRol();
                if(validarRol(rol)){
                    System.out.print("contraseña: ");
                    String password = input.next();
                    Usuario nuevo_usuario = new Usuario(cedula,nombre,apellidos,correo,password,rol);
                    System.out.println("¡REGISTRO EXITOSO!");

                    GuardarDatos.guardarUsuario(nuevo_usuario);
                }
                else {
                    System.out.println("ADVERTENCIA : Ya existe un adminitrador en el sistema");
                    return;
                }

            }
            else {
                System.out.println("¡ya existe una cédula con ese número!");
            }
        }
        System.out.print("Correo:");
        String correo=input.next(); // falta validar el correo
        String rol = elegirRol(); // falta valida rol
        System.out.print("Contraseña : ");
        String passw =input.next();
        System.out.println("¡REGISTRO EXITOSO!");
        Usuario nuevo_usuario = new Usuario(cedula,nombre,apellidos,correo,passw,rol);

        GuardarDatos.guardarUsuario(nuevo_usuario);
    }



    private static boolean cedulaEncontrada(String cedula){
        boolean flag = false;
        for (Usuario usuario:usuarios_cargados) {
            if(usuario.cedula.equals(cedula)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private static Usuario buscarUsuario(String cedula) {
        for (Usuario usuario:usuarios_cargados) {
            if(usuario.cedula.equals(cedula)) {
                return usuario;
            }
        }
        return null;
    }

    public static String elegirRol(){
        Scanner input = new Scanner(System.in);
        String rol="";
        System.out.println("SELECCIONE SU ROL");
        System.out.println("1. Administrador");
        System.out.println("2. Cliente");
        System.out.println("3. Empleado");
        String opcion = input.next();

        if(opcion.equals("1")){
            return  rol="administrador";
        }else if(opcion.equals("2")){
            return  rol="cliente";
        }else if(opcion.equals("3")){
            return  rol="empleado";
        }
        return rol;
    }


    public static boolean validarRol(String rol){
        boolean flag = true;
        if(rol.equals("administrador")){
            flag = false;
        }
        return flag;
    }
}
