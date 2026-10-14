package Parcial2025;

import java.util.ArrayList;

public class Colectivo extends Vehiculos {

    static int costo;

    public Colectivo(String patente,int modelo,int kilometros,int asientos){
        super(patente, modelo, kilometros, asientos);
    }

    @Override
    public int getCostoMantenimiento() {
       return costo*super.getCantidadAsientos();
    }
    @Override
public ArrayList<Vehiculos> buscar(Condicion condicion) {

    ArrayList<Vehiculos> resultado = new ArrayList<>();

    if (condicion.cumple(this)) {
        resultado.add(this);
    }

    return resultado;
}
}
