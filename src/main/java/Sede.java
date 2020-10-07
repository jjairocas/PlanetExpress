import java.util.ArrayList;

public class Sede {
    String nombre;
    int codigo;
    ArrayList<C_logistico> centros_logisticos;

    public Sede(String nombre, int codigo, ArrayList<C_logistico> centros_logisticos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.centros_logisticos = centros_logisticos;
    }

    public C_logistico buscarCentroLog(C_logistico centro){
        if(!this.centros_logisticos.isEmpty()){
            for(C_logistico centro_log:this.centros_logisticos){
                if(centro_log.direccion.equals(centro.direccion)){
                    return centro_log;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", centros_logisticos=" + centros_logisticos +
                '}';
    }
}
