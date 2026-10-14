package parcialSectores;

public class CondicionOR extends Condicion{
           Condicion c1,c2;
    
    @Override
    public boolean cumple(Municipio e) {
        return c1.cumple(e)||c2.cumple(e);
    }
}
