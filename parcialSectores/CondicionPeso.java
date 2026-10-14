package parcialSectores;

public class CondicionPeso extends Condicion{
 private double pesomin;
    @Override
    public boolean cumple(Municipio e) {
        return e.getPeso()<pesomin;
    }
    
}
