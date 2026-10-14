package ParcialVentas;

public class VendedorTrampyMentiroso extends Vendedor {
    private int multi;
    
    public VendedorTrampyMentiroso(String nombre, String apellido, int edad,int multi) {
        super(nombre, apellido, edad);
        this.multi=multi;
    }

    @Override
    public double getGanacias() {
        return super.getGanacias()*multi;
    }
    
}
