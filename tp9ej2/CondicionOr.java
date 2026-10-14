package tp9ej2;

public class CondicionOr extends Condicion {
    private Condicion c1,c2;

    @Override
    public boolean cumple(Pista e) {
        return c1.cumple(e)||c2.cumple(e);
    }
}
