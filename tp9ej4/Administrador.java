package tp9ej4;

import java.util.ArrayList;

import ParcialVentas.Condicion;

public abstract class Administrador {
    public abstract int cantidadanoticias();
    public abstract ArrayList<Administrador>buscar(Condicion c);
}
