package tp9ej2;

public class CondicionXAnio extends Condicion{
    private int anio;

    @Override
    public boolean cumple(Pista e) {
        return e.getAnio()==anio;
    }
    
}
