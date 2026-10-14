package prefinalColecciones;

public class CondicionNOT extends Condicion{
        private Condicion c;
        
    @Override
    public boolean cumple(Objeto o) {
        return !c.cumple(o);
    }
}
