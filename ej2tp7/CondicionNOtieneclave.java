package ej2tp7;

public class CondicionNOtieneclave extends Condicion{
    private String Palabra;
    @Override
    public boolean cumple(Documento d) {
        return !d.tienepalabraclave(Palabra);
    }
    
}
