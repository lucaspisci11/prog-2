package Parcial2025;

import java.util.ArrayList;

public class Taxi extends Vehiculos {
    static int costo;
    static int extra;
    static int año;
    public Taxi(String patente, int modelo, int kilometros, int asientos) {
        super(patente, modelo, kilometros, asientos);
    }

    @Override
    public int getCostoMantenimiento() {
        if(super.getModelo()>año){
            return costo*super.getKilometros();
        }
        else{
            return costo*super.getKilometros()+extra;
        }
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
