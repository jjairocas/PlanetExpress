public class Usuario {

    public String cedula;
    public String nombre;
    public String apellidos;
    public String correo;
    public String password;
    public String rol;

    public Usuario(String cedula, String nombre, String apellidos, String correo, String password, String rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }

    public Usuario() {

    }



    @Override
    public String toString() {
        return "Usuario{" +
                "cedula =" + cedula +
                ", nombre ='" + nombre + '\'' +
                ", apellidos ='" + apellidos + '\'' +
                ", correo ='" + correo + '\'' +
                ", password ='" + password + '\'' +
                ", rol ='" + rol + '\'' +
                '}';
    }


}


