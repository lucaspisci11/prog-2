package parcialFotografias;

public class CondicionPeso extends Condicion{
    private double maxpeso;

    @Override
    public boolean cumple(Fotografia e) {
        return e.getpeso()>maxpeso;
    }
    
}
