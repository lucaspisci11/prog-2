package ej2tp7;

public class CondicionXContenido extends Condicion{
    private String frase;

    @Override
    public boolean cumple(Documento d) {
        return d.contienefrase(frase);
    }
    
}
