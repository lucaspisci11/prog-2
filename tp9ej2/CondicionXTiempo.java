package tp9ej2;

public class CondicionXTiempo extends Condicion{
    private int tiempo;

    @Override
    public boolean cumple(Pista e) {
        return e.getDuracion()>tiempo;
    }
    
}
