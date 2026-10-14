package prefinalColecciones;

public class CondicionAnio extends Condicion {
    private int anioMin;
        @Override
    public boolean cumple(Objeto o) {
        return o.getAnio() < anioMin;
    }
}
