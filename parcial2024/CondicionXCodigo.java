package parcial2024;

public class CondicionXCodigo extends Condicion{
        String codigoBuscado;
    @Override
    public boolean cumple(Vendedor v) {
        return v.vendisteA(codigoBuscado);
    }
    
}
