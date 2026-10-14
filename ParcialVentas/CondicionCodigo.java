package ParcialVentas;

public class CondicionCodigo extends Condicion {
    String codigobuscado;
    
    @Override
    public boolean cumple(Vendedor v) {
        return v.vendisteA(codigobuscado);
    }
    
}


