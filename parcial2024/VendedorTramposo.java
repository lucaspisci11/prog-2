package parcial2024;

public class VendedorTramposo extends Vendedor{
    private int multi;

    public VendedorTramposo(String nombre, String apellido, int edad,int multi) {
        super(nombre, apellido, edad);
        this.multi=multi;
    }
    public int getGanaciasProducto(){
        return getCantProducto()*multi;
    }
}
