package parcial2024;

import java.util.ArrayList;

public abstract class ElementoVenta {
    public abstract int getGanaciasProducto();
    public abstract int getCantProducto();
    public abstract int getCantVenta();
    public abstract int getEdad();
    public abstract ArrayList<Vendedor> buscar(Condicion c); 
}
