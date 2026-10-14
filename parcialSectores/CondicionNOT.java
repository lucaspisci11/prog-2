package parcialSectores;


public class CondicionNOT extends Condicion{
        private Condicion c;
        
    @Override
    public boolean cumple(Municipio e) {
        return !c.cumple(e);
    }
}
