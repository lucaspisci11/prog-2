package Parcial2025;

import java.util.ArrayList;

public class FlotaEspecial extends Flota {

    private Condicion condicion;

    public FlotaEspecial(String patente, int modelo, int kilometros,int asientos, ArrayList<Vehiculos> vehiculos,Condicion condicion) {
        super(patente, modelo, kilometros, asientos, vehiculos);
        this.condicion = condicion;
    }

    @Override
    public void agregarVehiculo(Vehiculos v) {

        if (condicion.cumple(v)) {
            super.agregarVehiculo(v);
        }
    }
}