package prefinalColecciones;

public class CondicionPeso extends Condicion{
    private int pesomin;
    @Override
    public boolean cumple(Objeto o) {
        return o.getPeso() < pesomin;
    }
}
