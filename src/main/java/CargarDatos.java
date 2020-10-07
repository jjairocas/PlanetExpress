import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CargarDatos {

    public static ArrayList<Usuario> cargarUsuarios(){

        ArrayList<Usuario> usuariosLeidos = new ArrayList<>();

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("usuarios.json"))   {
            Object obj = jsonParser.parse(reader);
            JSONArray lista_Usuarios = (JSONArray)obj ;

            for(Object usuarioObjeto : lista_Usuarios){
                JSONObject usuarioJSON = (JSONObject) usuarioObjeto;
                usuariosLeidos.add(parseUsuario(usuarioJSON));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return usuariosLeidos;
    }

    public static Usuario parseUsuario(JSONObject usuarioJSON)
    {
        JSONObject atributos = (JSONObject) usuarioJSON.get("Usuario");

        String cedula =  (String) atributos.get("cedula");
        String nombre = (String) atributos.get("nombre");
        String apellidos = (String) atributos.get("apellidos");
        String password = (String) atributos.get("password");
        String correo = (String) atributos.get("correo");
        String rol = (String) atributos.get("rol");

        Usuario usuarioLeido = new Usuario(cedula,nombre,apellidos,correo,password,rol);
        return usuarioLeido;
    }
}
