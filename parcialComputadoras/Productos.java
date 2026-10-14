package parcialComputadoras;

public class Productos extends Empresa{
    private int Valor;
    private int Antiguedad;
    private String Descripcion;
    public Productos(int valor, int antiguedad, String descripcion,int Codigo) {
        super(Codigo);
        Valor = valor;
        Antiguedad = antiguedad;
        Descripcion = descripcion;
        
    }
    
}
