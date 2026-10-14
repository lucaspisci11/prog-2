package ParcialVentas;

public class Condicionganacias extends Condicion {
    double max;
    @Override
    public boolean cumple(Vendedor v) {
        return v.getGanacias()<max;
    }
    
}
