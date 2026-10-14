package ParcialVentas;

import java.util.Comparator;

public class ComparadorVentas implements Comparator<ElementoVenta> {

    @Override
    public int compare(ElementoVenta o1, ElementoVenta o2) {
        int v1=o1.getCantidadVentas();
        int v2=o2.getCantidadVentas();
            return v1-v2;
    }
    
}
