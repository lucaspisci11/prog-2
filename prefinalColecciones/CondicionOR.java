package prefinalColecciones;

public class CondicionOR extends Condicion {
        private Condicion c1, c2;

    @Override
    public boolean cumple(Objeto o) {
        return c1.cumple(o) || c2.cumple(o);
    }
}
