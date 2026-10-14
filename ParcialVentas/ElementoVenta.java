package ParcialVentas;
import java.util.ArrayList;

public abstract class ElementoVenta  {
    public abstract int getCantidadVentas();
    public abstract int getCantidadProductos();
    public abstract double getGanacias();
    public abstract int getEdad();
    public abstract ArrayList<Vendedor> buscar(Condicion c);

}
