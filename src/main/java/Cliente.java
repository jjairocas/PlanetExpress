import java.util.ArrayList;

public class Cliente extends Usuario {
    ArrayList<Paquete> paquetes;

    public Cliente(ArrayList<Paquete> paquetes) {
        super();
        this.paquetes = paquetes;
    }


    public void mostrarPaquete(){}

    public void enviarPaquete(){}

    public void recibirPaquete(){}


    public void mostrarPaquetes(){
        for(Paquete paquete: this.paquetes){
            paquete.toString();
        }


    }
}
