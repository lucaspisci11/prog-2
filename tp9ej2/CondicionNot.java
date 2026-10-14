package tp9ej2;

public class CondicionNot extends Condicion {
    private Condicion c1;
    
    @Override
    public boolean cumple(Pista e) {
        return !c1.cumple(e);
    }
    
}
