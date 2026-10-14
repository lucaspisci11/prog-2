package Parcial2025;

public class CondicionKilometros extends Condicion {

    private int kilometrosMaximos;

    public CondicionKilometros(int kilometrosMaximos) {
        this.kilometrosMaximos = kilometrosMaximos;
    }

    @Override
    public boolean cumple(Vehiculos v) {
        return v.getKilometros() <= kilometrosMaximos;
    }
}

