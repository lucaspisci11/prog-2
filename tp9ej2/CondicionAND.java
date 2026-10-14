package tp9ej2;

public class CondicionAND extends Condicion{

    private Condicion c1;
    private Condicion c2;

    @Override
    public boolean cumple(Pista e) {
        return c1.cumple(e) && c2.cumple(e);
    }
}

