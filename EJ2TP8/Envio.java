package EJ2TP8;
public abstract class Envio {
    private int tracking;

    public Envio(int tracking) {
        this.tracking = tracking;
    }

    public int getTracking() {
        return tracking;
    }

    public void setTracking(int tracking) {
        this.tracking = tracking;
    }
    public abstract double getPeso();
    public abstract String getDestinatario();
    public abstract String getRemitente();
    public abstract String getCiudadDestino();
    
}
