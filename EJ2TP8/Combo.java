package EJ2TP8;

import java.util.ArrayList;

public class Combo extends Envio{
    private ArrayList<Envio>elementos;

public Combo(int tracking) {
    super(tracking);
    this.elementos = new ArrayList<>();
}
    public void setTracking(int tracking) {

        // Cambia el tracking del combo
        super.setTracking(tracking);

        // Cambia el tracking de todo lo que contiene
        for (Envio e : elementos) {
            e.setTracking(tracking);
        }
    }

    public void agregarEnvio(Envio e) {

        if (elementos.isEmpty() ||
            e.getCiudadDestino().equals(this.getCiudadDestino())) {

            // El envío toma el tracking del combo
            e.setTracking(this.getTracking());

            elementos.add(e);
        }
    }
	@Override
	public double getPeso() {
		double pesototal=0;
        for(Envio e: elementos){
            pesototal+=e.getPeso();
        }
        return pesototal;
	}

	@Override
	public String getDestinatario() {
        if(!elementos.isEmpty()){
            return elementos.get(0).getDestinatario();
        }
        return null;
    }
	@Override
	public String getRemitente() {
        if(!elementos.isEmpty()){
            return elementos.get(0).getRemitente();
        }
        return null;
	}

	@Override
	public String getCiudadDestino() {
	        if(!elementos.isEmpty()){
            return elementos.get(0).getCiudadDestino();
        }
        return null;
	}
}
