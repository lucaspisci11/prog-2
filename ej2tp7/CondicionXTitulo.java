package ej2tp7;

public class CondicionXTitulo extends Condicion{
    private String titulodado;
    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().equals(titulodado);
    }
    
}
