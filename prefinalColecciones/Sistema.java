package prefinalColecciones;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Sistema {
    protected String Nombre;

    public Sistema(String nombre) {
    this.Nombre=Nombre;
    }
    public abstract int getAnio();
    public abstract double getValor();
    public abstract double getPeso();
    public abstract int getCantidadObjetos();
    public abstract boolean contiene(Objeto o);
    public abstract ArrayList<Objeto>Buscar(Condicion c, Comparator<Objeto> comp);
}
