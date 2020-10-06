public class Usuario {

    public int cedula;
    public String nombre;
    public String apellidos;
    public String correo;
    public String password;
    public String rol;

    public Usuario(int cedula, String nombre, String apellidos, String correo, String password, String rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }
}


