package tp8ej3;

public class FrutaXpesoyValor extends Fruta{
    private int valorfijo;
    private int multi;

    public FrutaXpesoyValor(int valorfijo, int multi) {
        this.valorfijo = valorfijo;
        this.multi = multi;
    }

    @Override
    public double calcularFuerza(double peso) {
       return valorfijo + peso*multi;
    }
    
}
