package ParcialVentas;

import java.util.Comparator;

public class ComparadorProductos implements Comparator<ElementoVenta> {

    @Override
    public int compare(ElementoVenta o1,ElementoVenta o2){
        int prod1=o1.getCantidadProductos();
        int prod2=o2.getCantidadProductos();
            return prod1-prod2;
    }
    
}
