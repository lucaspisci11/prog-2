package ej2tp7;

public class CondicionXpalabratitu extends Condicion {
    private String palabra;
    @Override
    public boolean cumple(Documento d) {
        return d.tienepalabra(palabra);
    }
    
}
