import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPrincipal {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String option;
        while(true) {
            System.out.println();
            System.out.println("_____________________________________________________________");
            System.out.println(" BIENVENIDO AL SISTEMA DE ENVIÓS");
            System.out.println("_____________________________________________________________");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Registrarse");
            System.out.println("0. Salir");
            System.out.println("_______________________________________________________________");
            System.out.print("opcion: ");
            option = input.next();
            if (option.equals("1")) {
                Usuario usuario_logeado = Autenticacion.iniciarSesion();
            } else if (option.equals("2")) {
                Autenticacion.registrarse();
            } else if (option.equals("0")) {
                System.out.println("¡Adios!");
                break;
            }
        }
    }
}
