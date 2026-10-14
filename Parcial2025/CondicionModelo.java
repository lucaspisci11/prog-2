package Parcial2025;

public class CondicionModelo extends Condicion {
     private int modeloMinimo;

    public CondicionModelo(int modeloMinimo) {
        this.modeloMinimo = modeloMinimo;
    }

    @Override
    public boolean cumple(Vehiculos v) {
        return v.getModelo() > modeloMinimo;
    }
}
