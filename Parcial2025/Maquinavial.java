package Parcial2025;

import java.util.ArrayList;

public class Maquinavial extends Vehiculos {

    private int horastabajadas;
    private  int costo;
    public Maquinavial(String patente, int modelo, int kilometros, int asientos, int horastabajadas) {
        super(patente, modelo, kilometros, asientos);
        this.horastabajadas = horastabajadas;
    }

    
    public int getHorastabajadas() {
        return horastabajadas;
    }


    public void setHorastabajadas(int horastabajadas) {
        this.horastabajadas = horastabajadas;
    }


    public int getCosto() {
        return costo;
    }


    public void setCosto(int costo) {
        this.costo = costo;
    }


    @Override
    public int getCostoMantenimiento() {
        return costo*horastabajadas;
    }
    public ArrayList<Vehiculos> buscar(Condicion condicion) {

    ArrayList<Vehiculos> resultado = new ArrayList<>();

    if (condicion.cumple(this)) {
        resultado.add(this);
    }

    return resultado;
}
}
