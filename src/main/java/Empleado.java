public class Empleado extends Usuario{

    public Empleado() {
        super();
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
