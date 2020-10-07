public class Paquete {
    int codigo;
    P_atencion origen;
    P_atencion destino;
    Cliente remitente;
    boolean estado;

    public Paquete(int codigo, P_atencion origen, P_atencion destino, Cliente remitente, boolean estado) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.remitente = remitente;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "codigo =" + codigo +
                ", origen =" + origen +
                ", destino =" + destino +
                ", remitente =" + remitente +
                ", estado =" + estado +
                '}';
    }
}
