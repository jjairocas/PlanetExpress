import java.util.ArrayList;
import java.util.Deque;

public class P_atencion {
    int codigo;
    ArrayList<Empleado> empleados = new ArrayList<>();
    Deque<Paquete> paquetes_por_enviar;
    ArrayList<Paquete> paquetes_por_recibir = new ArrayList<>();
    Deque<Cliente> clientes;


    public P_atencion(int codigo, ArrayList<Empleado> empleados, Deque<Paquete> paquetes_por_enviar, ArrayList<Paquete> paquetes_por_recibir, Deque<Cliente> clientes) {
        this.codigo = codigo;
        this.empleados = empleados;
        this.paquetes_por_enviar = paquetes_por_enviar;
        this.paquetes_por_recibir = paquetes_por_recibir;
        this.clientes = clientes;
    }

    public void mostrarEmpleados (){
        for(Empleado empleado: this.empleados){
            empleado.toString();
        }
    }

    @Override
    public String toString() {
        return "P_atencion{" +
                "codigo =" + codigo +
                ", empleados =" + empleados +
                ", paquetes_por_enviar =" + paquetes_por_enviar +
                ", paquetes_por_recibir =" + paquetes_por_recibir +
                ", clientes =" + clientes +
                '}';
    }
}
