package Parcial2025;

import java.util.ArrayList;

public class Flota extends Vehiculos{
    private ArrayList<Vehiculos>vehiculoss;

    public Flota(String patente, int modelo, int kilometros, int asientos, ArrayList<Vehiculos> vehiculoss) {
        super(patente, modelo, kilometros, asientos);
        this.vehiculoss = new ArrayList<>();
    }

        public void agregarVehiculo(Vehiculos v) {
        vehiculoss.add(v);
    }

    @Override
    public int getCostoMantenimiento() {
        int suma=0;
        for(Vehiculos v:vehiculoss) {
            suma+=v.getCostoMantenimiento();
        }
        return suma;
    }
    @Override
    public boolean tieneCaracteristica(String caracteristica) {
        for(Vehiculos v: vehiculoss){
            if(v.tieneCaracteristica(caracteristica)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int getModelo() {
        int modeloviejo=10000000;
        for(Vehiculos v:vehiculoss){
            int modelo=v.getModelo();
            if(modelo<modeloviejo){
                modeloviejo=modelo;
            }
        }
            return modeloviejo;
    }
    public int getKilometros() {
        int suma=0;
        for(Vehiculos v:vehiculoss){
            suma+=v.getKilometros();
        }
        return suma;
    }
    public int getCantidadAsientos() {
        int suma=0;
        for(Vehiculos v:vehiculoss){
            suma+=v.getCantidadAsientos();
        }
        return suma;
    }
    @Override
public ArrayList<Vehiculos> buscar(Condicion condicion) {

    ArrayList<Vehiculos> resultado = new ArrayList<>();

    for (Vehiculos v : vehiculoss) {
        resultado.addAll(v.buscar(condicion));
    }

    return resultado;
}
}
