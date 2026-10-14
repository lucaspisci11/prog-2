package ej2tp7;

public class CondicionXlargo extends Condicion{
    private int largo;

    @Override
    public boolean cumple(Documento d) {
        return d.cantidadPalabras()>=largo;
    }
}
