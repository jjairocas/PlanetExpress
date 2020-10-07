import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;

public class GuardarDatos {

    public static void guardarUsuario(Usuario usuario){
        JSONObject UsuarioDatos = new JSONObject();
        UsuarioDatos.put("cedula", usuario.cedula);
        UsuarioDatos.put("nombre", usuario.nombre);
        UsuarioDatos.put("apellidos", usuario.apellidos);
        UsuarioDatos.put("correo", usuario.correo);
        UsuarioDatos.put("password", usuario.password);
        UsuarioDatos.put("rol", usuario.rol);

        JSONObject UsuarioPerfil = new JSONObject();
        UsuarioPerfil.put("Usuario", UsuarioDatos);

        JSONArray lista_usuarios = new JSONArray();
        lista_usuarios.add(UsuarioPerfil);
        try (FileWriter file = new FileWriter("usuarios.json")) {
            file.write(lista_usuarios.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }
}
