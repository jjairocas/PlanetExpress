import java.util.ArrayList;

public class C_logistico {
    String direccion;
    Sede sede;
    ArrayList<P_atencion> puntos_atencion;
    ArrayList<Paquete> paquetes;
    ArrayList<Empleado> empleados;

    public C_logistico(String direccion, Sede sede, ArrayList<P_atencion> puntos_atencion, ArrayList<Paquete> paquetes, ArrayList<Empleado> empleados) {
        this.direccion = direccion;
        this.sede = sede;
        this.puntos_atencion = puntos_atencion;
        this.paquetes = paquetes;
        this.empleados = empleados;
    }

    public void mostrarPuntos(){
        for(P_atencion punto : this.puntos_atencion){
            System.out.println(punto);
        }
    }
}
