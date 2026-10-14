package parcial2024;

public class CondicionXGanacia extends Condicion {
    private int minimo;
    @Override
    public boolean cumple(Vendedor v) {
        return v.getGanaciasProducto()<minimo;
    }
    
}
