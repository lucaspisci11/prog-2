package ej2tp7;

public class CondicionXAutor extends Condicion{
    private String autorbuscado;

    @Override
    public boolean cumple(Documento d) {
        return d.contieneautor(autorbuscado);
    }
    
}
