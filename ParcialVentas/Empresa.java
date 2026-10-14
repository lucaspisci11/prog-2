package ParcialVentas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
    private ArrayList<ElementoVenta>vendedores;
    private Comparator<ElementoVenta>ordenador;

    public Empresa(ArrayList<ElementoVenta> vendedores, Comparator<ElementoVenta> ordenador) {
        this.vendedores = vendedores;
        this.ordenador = ordenador;
    }

    public ArrayList<ElementoVenta>obtenerRanking(){
    ArrayList<ElementoVenta>resultado= new ArrayList<>(vendedores);
        Collections.sort(resultado,ordenador);
        return resultado;
    }
}


