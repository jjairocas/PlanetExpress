import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPrincipal {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        while (true) {
            System.out.println();
            System.out.println("_____________________________________________________________");
            System.out.println(" BIENVENIDO AL SISTEMA DE ENVIÓS");
            System.out.println("_____________________________________________________________");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Registrarse");
            System.out.println("0. Salir");
            System.out.println("_______________________________________________________________");

            option = input.next();
            if (option.equals("1")) {
                iniciarSesion();
            } else if (option.equals("2")) {
                registrarse();
            } else if (option.equals("0")) {
                System.out.println("¡Adios!");
                break;
            }

        }
    }

    public static void iniciarSesion() {

        while(true){
            System.out.println();
            System.out.println("_____________________________________________________________");
            System.out.println(" Desea ingresar como Cliente o Empleado");
            System.out.println();
            System.out.println("1. Cliente");
            System.out.println("2. Empleado");
            System.out.println("0. Salir");
            System.out.println("_____________________________________________________________");
            System.out.println("opcion: ");
            String optionUsuario = input.next();

            if (optionUsuario.equals("1")) {
                ingresarCliente();
            } else if (optionUsuario.equals("2")) {
                ingresarEmpleado();
            } else if (optionUsuario.equals("0")){
                break;
            }
        }

    }



    public static void ingresarCliente() {


        while (true) {
            Usuario usuario_logeado = Autenticacion.iniciarSesion();
            //La idea es verificar que el usuario exista como cliente
            //en el caso contrario no mostrar el mensaje que el usuario
            //no existe y acabar con esta parte del programa

            System.out.println();
            System.out.println("_____________________________________________________________");
            System.out.println(" Bienvenido al sistema de envios " + " "); //nombre del usuario
            System.out.println("_____________________________________________________________");
            System.out.println("1. Mostrar paquete");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Recibir paquete");
            System.out.println("4. Paquetes que desea enviar");
            System.out.println("0. Salir");
            System.out.println("_______________________________________________________________");
            System.out.println("opcion: ");
            String option = input.next();

            if (option.equals("1")) {
                //metodo mostrar paquete desde la clase cliente
            } else if (option.equals("2")) {
                //metodo enviar paquete desde la clase cliente
            } else if (option.equals("3")) {
                // meteodo recibir paquete desde la clase cliente
            } else if(option.equals("4")){
                //metodo crear paquete desde la clase cliente
            }
            else if (option.equals("0")) {
                break;
            }

        }

    }

    public static void ingresarEmpleado() {

        Usuario usuario_logeado = Autenticacion.iniciarSesion();
        //La idea es verificar que el usuario exista como empleado
        //en el caso contrario no mostrar el mensaje que el usuario
        //no existe y acabar con esta parte del programa

        while (true) {
            System.out.println();
            System.out.println("_____________________________________________________________");
            System.out.println(" Bienvenido al sistema de envios " + " "); //nombre del usuario
            System.out.println("_____________________________________________________________");
            System.out.println("1. Enviar paquete a Punto de atencion");
            System.out.println("2. Buscar paquete");
            System.out.println("0. Salir");
            System.out.println("_______________________________________________________________");
            String optionEmpleado = input.next();

            if (optionEmpleado.equals("1")) {
                //metodo enviar paquete de la clase empleado
            } else if (optionEmpleado.equals("2")) {
                //Metodo buscar paquete de la clase empleado
            } else if (optionEmpleado.equals("0")) {
                break;
            }
        }
    }

    public static void registrarse() {
        Autenticacion.registrarse();
    }

}
