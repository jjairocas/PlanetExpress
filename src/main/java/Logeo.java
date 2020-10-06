import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Logeo {

    public static Scanner input = new Scanner(System.in);
    public static JSONArray lista_usuarios = new JSONArray();
    public static ArrayList<Usuario> array_usuarios= new ArrayList<>();

    public static void main(String[] args){
        cargarDatos();
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
                iniciarSesion();
            } else if (option.equals("2")) {
                registrarse();
            } else if (option.equals("0")) {
                System.out.println("¿Quiere guardar cambios? Y o N");
                String entrada = input.next();
                if(entrada.equals("Y")) {
                    guardar();
                    System.out.println("cambios guardados con éxito, adios");
                }
                else {
                    System.out.println("¡Adios!");
                }
                break;
            }
        }
    }

    private static void iniciarSesion() {
        String cedula,passw;

        if(!lista_usuarios.isEmpty()){
            System.out.print("Cédula: ");
            cedula=input.next();
            if(!cedulaValida(cedula)){
                JSONObject usuario = buscarUsuario(cedula);
                System.out.print("Constraseña: ");
                passw=input.next();
                if(usuario.get("password").equals(passw)){
                    System.out.println("_______________________________________");
                    System.out.println("Bienvenid@ al sistema "+usuario.get("nombre"));
                    System.out.println("_______________________________________");
                }
                else {
                    System.out.println("¡contraseña incorrecta!");
                }
            }
            else {
                System.out.println("¡NO EXISTE UNA CÉDULA CON ESE NÚMERO!");
            }
        }
    }

    public static void registrarse(){
        JSONObject usuario_nuevo = ingresarDatos();
        lista_usuarios.add(usuario_nuevo);
    }

    public static JSONObject ingresarDatos(){
        String nombre,passw,cedula;
        System.out.print("Nombre:");
        nombre=input.next();
        System.out.print("cédula:");
        cedula=input.next();
        if(!lista_usuarios.isEmpty()){
            if(cedulaValida(cedula)){
                System.out.print("contraseña: ");
                passw=input.next();
                if(passwordValida(passw)){

                    JSONObject usuario1 = new JSONObject();
                    usuario1.put("nombre",nombre);
                    usuario1.put("password",passw);
                    usuario1.put("cedula",cedula);
                    System.out.println("¡REGISTRO EXITOSO!");
                    return usuario1;
                }
                else {
                    System.out.println("¡Esa contraseña ya existe!");
                }
            }
            else {
                System.out.println("¡ya existe una cédula con ese número!");
            }
        }
        System.out.print("contraseña");
        passw=input.next();
        JSONObject usuario1 = new JSONObject();
        usuario1.put("nombre",nombre);
        usuario1.put("password",passw);
        usuario1.put("cedula",cedula);
        System.out.println("¡REGISTRO EXITOSO!");
        return usuario1;
    }
    public static boolean cedulaValida(String cedula){
        boolean flag = true;
        for (int i=0;i<lista_usuarios.size();i++) {
            JSONObject usuario = (JSONObject) lista_usuarios.get(i);
            if(usuario.get("cedula").equals(cedula)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static boolean passwordValida(String password){
        boolean flag = true;
        for (int i=0;i<lista_usuarios.size();i++) {
            JSONObject usuario = (JSONObject) lista_usuarios.get(i);
            if(usuario.get("password").equals(password)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static JSONObject buscarUsuario(String cedula) {
        for (int i = 0; i < lista_usuarios.size(); i++) {
            JSONObject usuario = (JSONObject) lista_usuarios.get(i);
            if (usuario.get("cedula").equals(cedula)) {
                return usuario;
            }
        }
        return null;
    }
    public static void cargarDatos(){
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("usuarios.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            lista_usuarios = (JSONArray) obj;


        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void guardar(){
        try (FileWriter file = new FileWriter("usuarios.json")) {

            file.write(lista_usuarios.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
