package prefinalColecciones;

public class CondicionMarca extends Condicion{
    private String marcaRequerida;
       @Override
    public boolean cumple(Objeto o) {
        return o.getMarca().equalsIgnoreCase( marcaRequerida);
    }
}
