package ej3tp7;

public class CondicionxClasifcacion extends Condicion{
    private String Clasi;

    @Override
    public boolean cumple(Planta p) {
        return p.getClasificacion().equals(Clasi);
    }
    
}
