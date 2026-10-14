package ParcialVentas;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<ElementoVenta> {
    @Override
    public int compare(ElementoVenta o1, ElementoVenta o2) {
        int v1=o1.getCantidadVentas();
        int v2=o2.getCantidadVentas();
        return Double.compare(v1/o1.getEdad(),v2/o2.getEdad());
    }
}
