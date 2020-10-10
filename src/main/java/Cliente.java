import java.util.ArrayList;

public class Cliente extends Usuario {
    ArrayList<Paquete> paquetes;


    public Cliente(ArrayList<Paquete> paquetes) {
        super();
        this.paquetes = paquetes;
    }


    public void enviarPaquete() {
        //"Ingrese los paquetes que desea enviar"
        //crear los objetos tipo Paquete, ingresarlos el la lista paquetes y despues ingresar la lista
        //de los paquete a la lista de paquetesAenviar en el Punto de atencion
    }

    public void recibirPaquete() {
        //Ingresar el codigo de los paquetes a recibir
        //Buscarlos en la lista de los paquetes en el Punto de atencion
        //Pasarlos a
    }

    public void crearPaquetes(){
        //metodo para que el cliente cree paquetes y los guarde en la lista paquetes
    }

    public void mostrarPaquetes(){
        //metodo para mostrar la lista de los paquetes
    }
}