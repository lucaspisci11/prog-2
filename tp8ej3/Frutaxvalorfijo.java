package tp8ej3;

public class Frutaxvalorfijo extends Fruta{
    private int valorfijo;

    public Frutaxvalorfijo(int valorfijo) {
        this.valorfijo = valorfijo;
    }

    @Override
    public double calcularFuerza(double peso) {
        return valorfijo;
    }
}
