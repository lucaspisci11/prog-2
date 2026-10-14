package ParcialVentas;

import java.util.Comparator;

public class ComparadorGanacias implements Comparator<ElementoVenta> {

    @Override
    public int compare(ElementoVenta o1, ElementoVenta o2) {
        double g1=o1.getGanacias();
        double g2=o2.getGanacias();
        return Double.compare(g1,g2);
    }
    
}
