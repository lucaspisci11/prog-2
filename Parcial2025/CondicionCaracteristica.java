package Parcial2025;

public class CondicionCaracteristica extends Condicion{

    private String caracteristica;

    public CondicionCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(Vehiculos v) {
        return v.tieneCaracteristica(caracteristica);
    }
}

