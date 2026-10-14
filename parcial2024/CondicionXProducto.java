package parcial2024;

public class CondicionXProducto extends Condicion {
    private int minimo;
    @Override
    public boolean cumple(Vendedor v) {
        return  v.getCantProducto()<minimo;
    }
    
}
