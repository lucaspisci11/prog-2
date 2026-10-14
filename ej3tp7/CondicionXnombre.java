package ej3tp7;

public class CondicionXnombre extends Condicion{
    private String palabra;

    @Override
    public boolean cumple(Planta p) {
        return p.tienepalabraennombre(palabra);
    }
}
