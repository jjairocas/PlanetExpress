import java.util.ArrayList;

public class EmpresaEnvio {
    String nombre;
    int nit;
    ArrayList<Sede> sedes;

    public EmpresaEnvio(String nombre, int nit, ArrayList<Sede> sedes) {
        this.nombre = nombre;
        this.nit = nit;
        this.sedes = sedes;
    }

    public void agregarSede(Sede sede){

        this.sedes.add(sede);
    }

    public void eliminarSede(Sede sede){
        this.sedes.remove(sede);
    }

    public Sede buscarSede(Sede sede_enviada){
        if(!this.sedes.isEmpty()){
            for(Sede sede:this.sedes){
                if(sede.codigo == sede_enviada.codigo){
                    return sede;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "EmpresaEnvio{" +
                "nombre='" + nombre + '\'' +
                ", nit=" + nit +
                ", sedes=" + sedes +
                '}';
    }
}
