package ej3tp7;

public class CondicionXsol extends Condicion{
    private int solsupe;
    private int riegoinf;
    @Override
    public boolean cumple(Planta p) {
       return  p.getSol()>solsupe && p.getRiego()<riegoinf;
    }

}
