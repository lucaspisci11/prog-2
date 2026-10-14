package ParcialVentas;

public class CondicionAnd extends Condicion {
    Condicion c1,c2;
    
    @Override
    public boolean cumple(Vendedor v) {
        return c1.cumple(v)&&c2.cumple(v);
    }
    
}
