package ej3tp7;

public class CondicionXriego extends Condicion{
    private int solinf;
    private int riegosup;
    @Override
    public boolean cumple(Planta p) {
    return p.getSol()<solinf && p.getRiego()>riegosup;
    }
}
