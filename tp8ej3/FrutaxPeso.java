package tp8ej3;

public class FrutaxPeso extends Fruta{
    private int multi;

    public FrutaxPeso(int multi) {
        this.multi = multi;
    }
    @Override
    public double calcularFuerza(double peso) {
        return peso*multi;
    }
    
}
