import java.util.ArrayList;

public class Cliente extends Usuario {
    ArrayList<Paquete> paquetes;


    public Cliente(ArrayList<Paquete> paquetes) {
        super();
        this.paquetes = paquetes;
    }
    

    public void enviarPaquete(){
        //"Ingrese los paquetes que desea enviar"
        //crear los objetos tipo Paquete, ingresarlos el la lista paquetes y despues ingresar la lista
        //de los paquete a la lista de paquetesAenviar en el Punto de atencion
    }

    public void recibirPaquete(){}


    public void mostrarPaquetes(){
        for(Paquete paquete: this.paquetes){
            paquete.toString();
        }


    }
}
