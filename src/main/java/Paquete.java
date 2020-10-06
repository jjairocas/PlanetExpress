public class Paquete {
    int codigo;
    P_atencion origen;
    P_atencion destino;
    Cliente remitente;
    Cliente destinatario;
    boolean estado;

    public Paquete(int codigo, P_atencion origen, P_atencion destino, Cliente remitente, Cliente destinatario, boolean estado) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.estado = estado;
    }
}
