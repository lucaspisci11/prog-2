package ParcialVentas;

public class CondicionProductos extends Condicion {
    int max;
    @Override
    public boolean cumple(Vendedor v) {
        return v.getCantidadProductos()<max;
    }
    
}
