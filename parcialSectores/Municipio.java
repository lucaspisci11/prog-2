package parcialSectores;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Municipio {
    public abstract double getVolumen();
    public abstract double getPeso();
    public abstract int getPedidos();
    public abstract boolean tienePalabra(String p);
    public abstract ArrayList<Pedidos>buscar(Condicion c);

}
