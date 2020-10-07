import java.util.ArrayList;

public class Cliente extends Usuario {
    ArrayList<Paquete> paquetes;

    public Cliente(ArrayList<Paquete> paquetes) {
        super();
        this.paquetes = paquetes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
