package parcialFotografias;

public class CondicionNot extends Condicion {
    private Condicion c1;
    @Override
    public boolean cumple(Fotografia e) {
        return !c1.cumple(e);
    }
    
}
