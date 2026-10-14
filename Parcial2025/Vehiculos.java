package Parcial2025;

import java.util.ArrayList;

public abstract class Vehiculos {

    protected String patente;
    private int modelo;
    private int kilometros;
    private int asientos;
    private ArrayList<String>caracteristicas;
    public Vehiculos(String patente, int modelo, int kilometros, int asientos) {
        this.patente = patente;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.asientos = asientos;
        this.caracteristicas=new ArrayList<>();
    }

    public int getModelo() {
        return modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public int getCantidadAsientos() {
        return asientos;
    }
    public void addCaracteristica(String caracteristica){
        caracteristicas.add(caracteristica);
    }
        public boolean tieneCaracteristica(String caracteristica) {
        return caracteristicas.contains(caracteristica);
    }

    public abstract int getCostoMantenimiento();
    public abstract ArrayList<Vehiculos> buscar(Condicion c);
}