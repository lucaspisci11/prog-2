package ej2tp7;

public class CondicionXpalabraclave extends Condicion{
    private String palabraclave;
    @Override
    public boolean cumple(Documento d) {
        return d.tienepalabraclave(palabraclave);
    }
    
}
